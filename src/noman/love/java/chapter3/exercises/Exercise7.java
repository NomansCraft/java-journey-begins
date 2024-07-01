package noman.love.java.chapter3.exercises;

import java.util.Scanner;

public class Exercise7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first edge: ");
        double firstEdge = scanner.nextDouble();

        System.out.print("Enter second edge: ");
        double secondEdge = scanner.nextDouble();

        System.out.print("Enter third edge: ");
        double thirdEdge = scanner.nextDouble();

        boolean isValidTriangle = isTriangleValid(firstEdge, secondEdge, thirdEdge);

        if (isValidTriangle) {
            System.out.println("Inputs are valid");
        } else {
            System.out.println("Inputs are invalid");
        }

        scanner.close();
    }

    public static boolean isTriangleValid(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
}
