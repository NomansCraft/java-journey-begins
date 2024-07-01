package noman.love.java.chapter3.exercises;

import java.util.Scanner;

public class Exercise3 {
    private static final String WEIGHT_PROMPT = "Enter weight in kilogram:";
    private static final String HEIGHT_PROMPT = "Enter height in meter:";
    private static final String OUTPUT_FORMAT = "Your weight is %.2f kilogram, and height is %.2f meter. So, your BMI (Body Mass Index) is %.2f.";

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println(WEIGHT_PROMPT);
        double weightInKilogram = userInput.nextDouble();

        System.out.println(HEIGHT_PROMPT);
        double heightInMeter = userInput.nextDouble();

        double calculatedBMI = weightInKilogram / (heightInMeter * heightInMeter);

        System.out.printf(OUTPUT_FORMAT, weightInKilogram, heightInMeter, calculatedBMI);

        userInput.close();
    }
}
