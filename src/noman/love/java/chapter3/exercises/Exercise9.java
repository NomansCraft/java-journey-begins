package noman.love.java.chapter3.exercises;

import java.util.Scanner;

public class Exercise9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount in BDT: ");
        double amountBDT = scanner.nextDouble();

        System.out.print("Enter exchange rate (in USD): ");
        double exchangeRateUSD = scanner.nextDouble();

        System.out.print("Enter exchange rate (in CAD): ");
        double exchangeRateCAD = scanner.nextDouble();

        double bdtToUSD = amountBDT * exchangeRateUSD;
        double bdtToCAD = amountBDT * exchangeRateCAD;

        System.out.println("USD: " + bdtToUSD);
        System.out.println("USD: " + bdtToCAD);

        scanner.close();
    }
}
