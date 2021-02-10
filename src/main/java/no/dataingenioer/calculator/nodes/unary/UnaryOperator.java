package no.dataingenioer.calculator.nodes.unary;

import no.dataingenioer.calculator.nodes.Calculable;

public abstract class UnaryOperator extends Calculable {

    protected Calculable left;

    public UnaryOperator(Calculable left) {

        this.left = left;
    }
}
