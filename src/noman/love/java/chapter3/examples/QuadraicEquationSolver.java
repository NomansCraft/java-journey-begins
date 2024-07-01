package noman.love.java.chapter3.examples;

import java.util.Scanner;

public class QuadraicEquationSolver {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        int a = userInput.nextInt();
        System.out.println("Enter the value of b: ");
        int b = userInput.nextInt();
        System.out.println("Enter the value of c: ");
        int c = userInput.nextInt();

        double determinant = b * b - 4.0 * a * c;

        if (determinant > 0.0) {
            double root1 = (-b + Math.sqrt(determinant)) / (2.0 * a);
            double root2 = (-b + Math.sqrt(determinant)) / (2.0 * a);
            System.out.println("The roots are " + root1 + " and " + root2);
        } else if (determinant == 0.00) {
            double root = -b / (2.0 * a);
            System.out.println("The root is " + root);
        } else {
            System.out.println("The equation has no real toots.");
        }
    }
}