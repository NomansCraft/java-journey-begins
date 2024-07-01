package noman.love.java.chapter2.examples;

import java.util.Scanner;

public class ComputeArea {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of a circle: ");
        double radius = input.nextDouble();

        double area = radius * radius * 3.14159;

        System.out.println("Area: " + area);
    }
}
