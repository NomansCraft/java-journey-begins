package noman.love.java.chapter3.exercises;

import java.util.Scanner;

public class Exercise15 {

    public static void main(String[] args) {
        // Create Scanner object for reading user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a integer
        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();

        // Check if the number is divisible by both 5 and 6
        boolean isDivisibleBy5and6 = (userInput % 5 == 0) && (userInput % 6 == 0);
        // Check if the number is divisible by 5
        boolean isDivisibleBy5 = userInput % 5 == 0;
        // Check if the number is divisible by 6
        boolean isDivisibleBy6 = userInput % 6 == 0;

        // Determine and print the result based on the divisibility checks
        if (isDivisibleBy5and6) {
            System.out.printf("Number (%d) is divisible by both 5 and 6%n", userInput);
        } else if (isDivisibleBy5) {
            System.out.printf("Number (%d) is divisible by only 5%n", userInput);
        } else if (isDivisibleBy6) {
            System.out.printf("Number (%d) is divisible by ony 6%n", userInput);
        } else {
            System.out.printf("Number (%d) is not divisible by 5 or 6%n", userInput);
        }

        // Close the scanner
        scanner.close();
    }
}
