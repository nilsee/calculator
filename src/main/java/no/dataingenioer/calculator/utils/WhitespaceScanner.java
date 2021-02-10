package no.dataingenioer.calculator.utils;

public class WhitespaceScanner implements Scanner {

    public String[] scan(String text) {

        return text.split(" ");
    }
}
