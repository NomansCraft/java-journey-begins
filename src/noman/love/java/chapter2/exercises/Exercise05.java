package noman.love.java.chapter2.exercises;

import java.util.Scanner;

public class Exercise05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length value: ");
        int length = input.nextInt();

        System.out.println("Enter the width value: ");
        int width = input.nextInt();

        int area = length * width;
        int perimeter = 2 * (length + width);

        System.out.println("Area of a Rectangle is: " + area);
        System.out.println("Perimeter of a Rectangle is: " + perimeter);
    }
}
