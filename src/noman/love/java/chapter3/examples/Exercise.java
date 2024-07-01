package noman.love.java.chapter3.examples;

import java.util.Scanner;

public class Exercise {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        boolean isDivisibleBy2 = number % 2 == 0;
        boolean isDivisibleBy5 = number % 5 == 0;
        boolean isDivisibleByBoth2And5 = isDivisibleBy2 && isDivisibleBy5;

        if (isDivisibleByBoth2And5) {
            System.out.println(number + " is divisible by both a and b.");
        } else {
            System.out.println(number + " is not divisible by both a and b.");
        }
    }
}
