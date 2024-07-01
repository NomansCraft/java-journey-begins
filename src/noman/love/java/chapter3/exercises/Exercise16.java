package noman.love.java.chapter3.exercises;

import java.util.Scanner;

public class Exercise16 {

    public static void main(String[] args) {
        // Create a Scanner object for reading user input
        Scanner scanner = new Scanner(System.in);

        double bikePrice = 500000.00; // Bike price
        // Prompt Bike price
        System.out.printf("MotoBike Price is %.2f%n", bikePrice);

        // Prompt user to enter fixed amount for deposit
        System.out.print("Enter your monthly amount: ");
        double monthlyAmount = scanner.nextDouble();

        // Calculate expected month for buying car
        double expectedMonths = bikePrice / monthlyAmount;
        double expectedDays = expectedMonths * 30;

        System.out.printf("You will buy the bike within %.2f months%n", expectedMonths);
        System.out.printf("You will buy the bike within %.2f days%n", expectedDays);

        // Cloase the scanner
        scanner.close();
    }
}
