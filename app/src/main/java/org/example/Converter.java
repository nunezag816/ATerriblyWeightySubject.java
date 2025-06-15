package org.example;

public class Converter {
    public static String toPoundsAndOunces(int ounces) {
        int pounds = ounces / 16;
        int remainingOunces = ounces % 16;
        return ounces + " oz is equivalent to " + pounds + " lbs and " + remainingOunces + " oz.";
    }

    public static String toDecimalPounds(int ounces) {
        double decimalPounds = ounces / 16.0;
        return String.format("%d oz is equivalent to %.4f lbs.", ounces, decimalPounds);
    }
}
