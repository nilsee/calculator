package no.dataingenioer.calculator.nodes.binary;

import no.dataingenioer.calculator.nodes.Calculable;

public class AddOperator extends BinaryOperator {

    public AddOperator(Calculable left, Calculable right) {

        super(left, right);
    }

    public double result() {

        return left.result() + right.result();
    }
}
