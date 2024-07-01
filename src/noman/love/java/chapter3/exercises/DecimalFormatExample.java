package noman.love.java.chapter3.exercises;

import java.text.DecimalFormat;

public class DecimalFormatExample {

    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("$#.##");

        double amount = 180.1252;
        System.out.println(amount);

        String formattedAmount = decimalFormat.format(amount);
        System.out.println(formattedAmount);
    }
}
