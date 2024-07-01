package noman.love.java.chapter3.examples;

import java.util.Scanner;

public class EqualityExercise {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = userInput.nextInt();
        System.out.println("Enter second number: ");
        int b = userInput.nextInt();

        boolean isAGreaterThanB = a > b;
        if(isAGreaterThanB) {
            System.out.println(a + " is greater than " + b);
        }

        boolean isALessThanB = a < b;
        if (isALessThanB) {
            System.out.println(a + " is less than " + b);
        }
    }
}
