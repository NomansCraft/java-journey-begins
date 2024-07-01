package noman.love.java.chapter4.examples;

import java.util.Scanner;

public class NumberGuess {
    static final int SECRET_NUMBER = 86 ;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter you guessed number: ");
        int guessNumber = scanner.nextInt();


        if (guessNumber == SECRET_NUMBER) {
            System.out.println("Congratulation, you guessed the number correctly.");
        } else if (guessNumber > SECRET_NUMBER) {
            System.out.println("The number is greater than " + SECRET_NUMBER);
        } else {
            System.out.println("The number is less than " + SECRET_NUMBER);
        }
    }
}
