package noman.love.java.chapter3.exercises;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter 1st number:");
        double firstNum = userInput.nextDouble();

        System.out.println("Enter 2nd number:");
        double secondNum = userInput.nextDouble();

        System.out.println("Enter 3rd number:");
        double thirdNum = userInput.nextDouble();

        System.out.println("Enter 4th number:");
        double fourthNum = userInput.nextDouble();

        // Calculate the avarage
        double averageDouble = (firstNum + secondNum + thirdNum + fourthNum) / 4;

        // Print the average with 3 decimal places
        System.out.println("Average of 4 numbers is: " + String.format("%.3f", averageDouble));

        // Print individual numbers with specified precision
        System.out.printf("firstNum: %.2f, seconfNum: %.3f, thirdNum: %.4f, fourthNum: %.5f", firstNum, secondNum, thirdNum, fourthNum);

        // Close the scanner to free up resources+
        userInput.close();
    }
}