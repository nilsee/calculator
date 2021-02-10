package no.dataingenioer.calculator;

import java.util.Stack;

import no.dataingenioer.calculator.nodes.Calculable;
import no.dataingenioer.calculator.nodes.Constant;
import no.dataingenioer.calculator.nodes.binary.AddOperator;
import no.dataingenioer.calculator.nodes.binary.DivideOperator;
import no.dataingenioer.calculator.nodes.binary.MultiplyOperator;
import no.dataingenioer.calculator.nodes.binary.SubtractOperator;
import no.dataingenioer.calculator.nodes.unary.DecrementOperator;
import no.dataingenioer.calculator.nodes.unary.IncrementOperator;
import no.dataingenioer.calculator.utils.Utils;

public class ExpressionBuilder {

    public Calculable build(String [] tokens) {

        Stack<Calculable> stack = new Stack<Calculable>();

        for (String token : tokens) {

            if( token.equals("+") ) {

                Calculable a = stack.pop(), b = stack.pop();
                stack.push(new AddOperator(b, a));
            }
            else if( token.equals("-") ) {

                Calculable a = stack.pop(), b = stack.pop();
                stack.push(new SubtractOperator(b, a));
            }
            else if( token.equals("*") ) {

                Calculable a = stack.pop(), b = stack.pop();
                stack.push(new MultiplyOperator(b, a));
            }
            else if( token.equals("/") ) {

                Calculable a = stack.pop(), b = stack.pop();
                stack.push(new DivideOperator(b, a));
            }
            else if( token.equals("++") ) {

                Calculable a = stack.pop();
                stack.push(new IncrementOperator(a));
            }
            else if( token.equals("--") ) {

                Calculable a = stack.pop();
                stack.push(new DecrementOperator(a));
            }
            else if (Utils.isDouble(token)) {

                stack.push(new Constant(Double.parseDouble(token)));
            }
            else {

                throw new IllegalStateException("Unknown token: " + token);
            }
        }

        Calculable result = stack.pop();

        if( ! stack.isEmpty() ) {

            throw new IllegalStateException("Expression tree incomplete");
        }

        return result;
    }

}
