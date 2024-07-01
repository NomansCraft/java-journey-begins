package noman.love.java.chapter3.exercises;

import java.util.Scanner;

public class Exercise19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter height: ");
        double heightOfRectangle = scanner.nextDouble();
        System.out.print("Enter width: ");
        double widthOfRactangle = scanner.nextDouble();
        System.out.print("Enter radius: ");
        double circleRadius = scanner.nextDouble();

        double rectangleDiagonal = Math.sqrt(heightOfRectangle * heightOfRectangle + widthOfRactangle * widthOfRactangle);
        double circleDiameter = 2 * circleRadius;

        if (rectangleDiagonal <= circleDiameter) {
            System.out.println("The rectangle can fit inside the circle.");
        } else {
            System.out.println("The rectangle cannot fit inside the circle.");
        }
    }
}
