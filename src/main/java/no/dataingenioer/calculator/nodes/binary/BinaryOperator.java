package no.dataingenioer.calculator.nodes.binary;

import no.dataingenioer.calculator.nodes.Calculable;

public abstract class BinaryOperator extends Calculable {

    protected Calculable left;
    protected Calculable right;

    public BinaryOperator(Calculable left, Calculable right) {

        this.left = left;
        this.right = right;
    }
}
