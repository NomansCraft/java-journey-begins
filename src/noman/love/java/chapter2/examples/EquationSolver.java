package noman.love.java.chapter2.examples;

import java.util.Scanner;

public class EquationSolver {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter value of \"x\": ");
        double x = input.nextDouble();

        System.out.println("Enter value of \"a\": ");
        int a = input.nextInt();

        System.out.println("Enter value of \"b\": ");
        int b = input.nextInt();

        System.out.println("Enter value of \"c\": ");
        int c = input.nextInt();

        double y = a * x * x + b * x + c;

        System.out.println("result: " + y);
    }
}
