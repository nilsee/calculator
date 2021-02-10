package no.dataingenioer.calculator.nodes.binary;

import no.dataingenioer.calculator.nodes.Calculable;

public class MultiplyOperator extends BinaryOperator {

    public MultiplyOperator(Calculable left, Calculable right) {

        super(left, right);
    }

    public double result() {

        return left.result() * right.result();
    }
}