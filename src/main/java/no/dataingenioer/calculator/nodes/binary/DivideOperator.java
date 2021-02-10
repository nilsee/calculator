package no.dataingenioer.calculator.nodes.binary;

import no.dataingenioer.calculator.nodes.Calculable;

public class DivideOperator extends BinaryOperator {

    public DivideOperator(Calculable left, Calculable right) {

        super(left, right);
    }

    public double result() {

        return left.result() / right.result();
    }
}