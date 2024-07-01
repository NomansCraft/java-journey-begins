package noman.love.java.chapter3.examples;

import java.util.Scanner;

public class LengthConversionCalculator {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter a length in inches: ");
        double inchesValue = userInput.nextDouble();

        double meterValue = inchesValue * 0.0254;

        System.out.println(inchesValue + " inches is " + meterValue + " meters.");
    }
}
