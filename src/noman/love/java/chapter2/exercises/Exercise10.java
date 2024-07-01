package noman.love.java.chapter2.exercises;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter radian: ");
        double radianValue = userInput.nextDouble();

        double degree = radianValue * 180.0 / Math.PI;

        System.out.println("Degree: " + degree);
    }

}
