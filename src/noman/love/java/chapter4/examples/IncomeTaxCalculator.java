package noman.love.java.chapter4.examples;

import java.util.Scanner;

public class IncomeTaxCalculator {

    public static void main(String[] args) {
        System.out.print("Enter your yearly income: ");
        Scanner scanner = new Scanner(System.in);
        double income = scanner.nextDouble();

        double taxableIncome = income - 300000; // No tax till 300000
        double tax;

        if (taxableIncome <= 100000) {
            tax = taxableIncome * 0.05;
        } else if (taxableIncome <= (100000 + 300000)) {
            tax = (100000 * 0.05) + ((taxableIncome - 100000) * 0.10);
        } else if (taxableIncome <= (100000 + 300000 + 400000)) {
            tax = (100000 * 0.05) + (300000 * 0.10) + ((taxableIncome - (100000 + 300000)) * 0.15);
        } else if (taxableIncome <= (100000 + 300000 + 400000 + 500000)) {
            tax = (100000 * 0.05) + (300000 * 0.10) + (400000 * 0.15) + ((taxableIncome - (100000 + 300000 + 400000)) * 0.20);
        } else {
            tax = (100000 * 0.05) + (300000 * 0.10) + (400000 * 0.15) + ((taxableIncome - (100000 + 300000 + 400000 + 500000)) * 0.25);
        }

        System.out.printf("Your tax is: %.2f", tax);
    }
}
