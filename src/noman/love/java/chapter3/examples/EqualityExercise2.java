package noman.love.java.chapter3.examples;

import java.util.Scanner;

public class EqualityExercise2 {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int a = userInput.nextInt();
        System.out.println("Enter another number: ");
        int b = userInput.nextInt();

        boolean isAEqualToB = a == b;
        System.out.println("isAEqualToB = " + isAEqualToB);

        boolean isANotEqualToB = a != b;
        System.out.println("isANotEqualToB = " + isANotEqualToB);

        boolean isAGreaterThanOrEqualToB = a >= b;
        System.out.println("isAGreaterThanOrEqualToB =  " + isAGreaterThanOrEqualToB);

        boolean isALessThanOrEqualToB = a <= b;
        System.out.println("isALessThanOrEqualToB = " + isALessThanOrEqualToB);
    }
}
