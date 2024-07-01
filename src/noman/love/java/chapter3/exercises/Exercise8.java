package noman.love.java.chapter3.exercises;

import java.util.Scanner;

public class Exercise8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000: ");
        int userInput = scanner.nextInt();

        if (userInput < 0 || userInput > 1000) {
            System.out.println("Invalid number");
        } else {
            int sum = 0;
            int originalNumber = userInput;

            // Calculation the sum of digits
            while (userInput != 0) {
                sum += userInput % 10;
                userInput = userInput / 10;
            }

            System.out.printf("Sum of %d is: %d", originalNumber, sum);
        }

        scanner.close();
    }
}
