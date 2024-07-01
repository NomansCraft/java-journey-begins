package noman.love.java.chapter3.exercises;

import java.util.Scanner;

public class Exercise14 {

    public static void main(String[] args) {
        // Create a Scanner object for reading user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter total call duration in minutes
        System.out.print("Enter total call duration in minutes: ");
        int totalCallDuration = scanner.nextInt();

        double totalBill = 125; // Base bill for upto 500 minutes
        double extraMinutes;

        if (totalCallDuration <= 500) {
            // If total call duration is between 501 and 100 minutes
            System.out.printf("Total bill: %.2f", totalBill);
        } else if (totalCallDuration < 1000) {
            // If total call duration is between 501 and 1000 minutes
            extraMinutes = totalCallDuration - 500;
            totalBill += extraMinutes * 0.25;
            System.out.printf("Total bill: %.2f", totalBill);
        } else  {
            // If total call duration is more than 1000 minutes
            extraMinutes = totalCallDuration - 1000;
            totalBill += (500 * 0.25) + (extraMinutes * 0.49);
            System.out.printf("Total bill: %.2f", totalBill);
        }

        // Close the scanner
        scanner.close();
    }
}
