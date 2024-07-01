package noman.love.java.chapter2.exercises;

import java.util.Scanner;

public class Exercise06 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of Hexagon: ");
        double length = input.nextDouble();

        double area = (3 * Math.sqrt(3) * Math.pow(length, 2)) / 2;

        System.out.println("Area of your hexagon is: " + area);
    }
}
