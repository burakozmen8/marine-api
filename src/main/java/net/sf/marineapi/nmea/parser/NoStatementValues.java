package net.sf.marineapi.nmea.parser;

public class NoStatementValues {

    public static int numericNoStatement = Integer.MIN_VALUE;
    public static char charNoStatement = Character.MIN_VALUE;

    public static void setCharNoStatement(char charNoStatement) {
        NoStatementValues.charNoStatement = charNoStatement;
    }

    public static void setNumericNoStatement(int numericNoStatement) {
        NoStatementValues.numericNoStatement = numericNoStatement;
    }

    public boolean isNoStatementValue(int value) {
        return value == numericNoStatement;
    }

    public boolean isNoStatementValue(char value) {
        return value == charNoStatement;
    }
}
