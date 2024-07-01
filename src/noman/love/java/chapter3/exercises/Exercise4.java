package noman.love.java.chapter3.exercises;

import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter coordinates of vertex A (Ax, Ay):");
        double aX = scanner.nextDouble();
        double aY = scanner.nextDouble();

        System.out.println("Enter coordinates of vertex B (Bx, By):");
        double bX = scanner.nextDouble();
        double bY = scanner.nextDouble();

        System.out.println("Enter coordinates of vertex C (Cx, Cy):");
        double cX = scanner.nextDouble();
        double cY = scanner.nextDouble();

        // Calculate the area of the triangle
        double area = calculateTriangleArea(aX, aY, bX, bY, cX, cY);

        System.out.printf("The area of the triangle is: %.2f square units%n", area);

        scanner.close();
    }

    // Method to calculate the area of a triangle given its vetices
    public static double calculateTriangleArea(double aX, double aY, double bX, double bY, double cX, double cY) {
        // Using the determinat method to calculate area
        return 0.5 * Math.abs(aX * (bY - cY) + bX * (cY - aY) + cX * (aY - bY));
    }
}
