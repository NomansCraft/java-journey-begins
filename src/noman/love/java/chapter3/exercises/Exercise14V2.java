package noman.love.java.chapter3.exercises;

import java.util.Scanner;

public class Exercise14V2 {

    public static void main(String[] args) {
        // Create a Scanner object for reading user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter total call duration in minutes
        System.out.print("Enter total call duration in minutes: ");
        int totalCallDuration = scanner.nextInt();

        double totalBill = 500.00; // Base bill for up to 500 minutes
        double extraMinutes;
        double extraBill;

        if (totalCallDuration <= 500) {
            // If total call duration is between 501 and 100 minutes
            System.out.println("Total bill: " + totalBill);
        } else if (totalCallDuration < 1000) {
            extraMinutes = totalCallDuration - 500; // Extra minutes beyond 500
            extraBill = extraMinutes * 0.25; // Charge for extra minutes at 0.25 per minutes
            totalBill += extraBill;
            System.out.println("Total bill: " + totalBill);
        } else  {
            // If total call duration is more than 1000 minutes
            extraMinutes = totalCallDuration - 1000; // Extra minutes beyond 1000
            extraBill = (500 * 0.25) + (extraMinutes * 0.49); // Charge for 501-1000 minutes at 0.25 and beyond 1000 minutes at 0.49  per minutes
            totalBill += extraBill;
            System.out.println("Total bill: " + totalBill);
        }

        // Close the scanner
        scanner.close();
    }
}
