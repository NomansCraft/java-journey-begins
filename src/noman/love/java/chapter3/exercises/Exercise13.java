package noman.love.java.chapter3.exercises;

import java.util.Scanner;

public class Exercise13 {

    public static void main(String[] args) {
        // Create a Scanner object for reading user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();

        // Calculate the last digit of the input number
        int lastDigit = userInput % 10;

        // Print the last digit
        System.out.println("Last digit: " + lastDigit);

        // Close the scanner
        scanner.close();
    }
}
