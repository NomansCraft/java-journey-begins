package noman.love.java.chapter3.examples;

import java.util.Scanner;

public class ExpressionSolver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y, a, b;
        System.out.println("Enter value of x: ");
        x = scanner.nextInt();
        System.out.println("Enter value of y: ");
        y = scanner.nextInt();
        System.out.println("Enter value of a: ");
        a = scanner.nextInt();
        System.out.println("Enter value of b: ");
        b = scanner.nextInt();

        double result = (x - 5 / 2.0 + 2 * ((55 - y) / (double) a - (b + 9) / (double) y) / 2.5 + 42);

        System.out.println("Result = " + result);
    }
}
