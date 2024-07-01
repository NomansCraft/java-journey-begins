package noman.love.java.chapter2.exercises;

import java.util.Scanner;

public class Exercise01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        int userFirstNumber = input.nextInt();

        System.out.println("Enter your second Number: ");
        int userSecondNumber = input.nextInt();

        int sum = userFirstNumber + userSecondNumber;
        int differance = userFirstNumber - userSecondNumber;
        int product = userFirstNumber * userSecondNumber;
        int quotient = userFirstNumber / userSecondNumber;

        System.out.println();
        System.out.println("Sum: " + sum);
        System.out.println("Differance: " + differance);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}
