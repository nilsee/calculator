package no.dataingenioer.calculator.nodes.unary;

import no.dataingenioer.calculator.nodes.Calculable;

public class IncrementOperator  extends UnaryOperator {

    public IncrementOperator(Calculable left) {

        super(left);
    }

    public double result() {

        double data = left.result();
        return ++data;
    }
}