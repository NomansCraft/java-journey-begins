package noman.love.java.chapter4.examples;

import java.util.Scanner;

public class VoterEligibilityChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = scanner.nextInt();

        if (age < 18) {
            System.out.println("Sorry, You're not eligible to vote. Better luck next time.");
        } else {
            System.out.println("Congratulation! You're eligible to vote.");
        }
    }
}
