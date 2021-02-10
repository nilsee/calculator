package no.dataingenioer.calculator.utils;

public class Utils {

    public static boolean isDouble(String s) {

        try {
            Double.parseDouble(s); return true;
        }
        catch(NumberFormatException e) {
            return false;
        }
        catch(NullPointerException e) {
            return false;
        }
    }
}
