package noman.love.java.chapter3.exercises;

import java.util.Scanner;

public class Exercise10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your amount: ");
        int amount = scanner.nextInt();

        double percentage = 1.85 / 100;
        double charge = amount * percentage;

        System.out.printf("Chanrge = %.2f", charge);

        scanner.close();
    }
}
