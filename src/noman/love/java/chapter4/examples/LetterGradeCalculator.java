package noman.love.java.chapter4.examples;

import java.util.Scanner;

public class LetterGradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter score:");
        int score = scanner.nextInt();

        if (score >= 80) {
            System.out.println("A+");
        } else {
            if (score >= 70) {
                System.out.println("A");
            } else {
                if (score >= 60) {
                    System.out.println("A-");
                } else {
                    if (score >= 50) {
                        System.out.println("B");
                    } else {
                        if (score >= 40) {
                            System.out.println("C");
                        } else {
                            if (score >=33) {
                                System.out.println("D");
                            } else {
                                System.out.println("F");
                            }
                        }
                    }
                }
            }
        }
    }
}
