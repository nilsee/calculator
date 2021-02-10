package no.dataingenioer.calculator.nodes;

public class Constant extends Calculable {

    protected double data;

    public Constant(double data) {

        this.data = data;
    }

    public double result() {

        return data;
    }
}
