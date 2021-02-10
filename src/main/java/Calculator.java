import no.dataingenioer.calculator.ExpressionBuilder;
import no.dataingenioer.calculator.nodes.Calculable;
import no.dataingenioer.calculator.utils.WhitespaceScanner;

public class Calculator {

    public static void main(String [] args) {

        if(args.length != 1) {

            System.err.println("Calculator must be given an expression (reverse polish notation)");
            System.exit(-1);
        }

        WhitespaceScanner scanner = new WhitespaceScanner();

        String [] tokens =  scanner.scan(args[0]);

        ExpressionBuilder builder = new ExpressionBuilder();

        Calculable result = builder.build(tokens);

        System.out.println(result.result());
    }

}
