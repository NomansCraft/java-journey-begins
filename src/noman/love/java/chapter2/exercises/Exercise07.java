package noman.love.java.chapter2.exercises;

import java.util.Scanner;

public class Exercise07 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter \"x1\" value: ");
        double x1Value = input.nextDouble();

        System.out.println("Enter \"x2\" value: ");
        double x2Value = input.nextDouble();

        System.out.println("Enter \"y1\" value: ");
        double y1Value = input.nextDouble();

        System.out.println("Enter \"y2\" value:");
        double y2Value = input.nextDouble();

        double distance = Math.sqrt(Math.pow(x2Value - x1Value, 2) + Math.pow(y2Value - y1Value, 2));

        System.out.println("Distance is: " + distance);
    }
}
