package noman.love.java.chapter3.exercises;

import java.util.Scanner;

public class Exercise18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter total slices: ");
        int slices = scanner.nextInt();
        System.out.print("Enter number of friends: ");
        int friends = scanner.nextInt();
        System.out.print("How many slices each wants: ");
        int wantSlices = scanner.nextInt();

        int possibleSlices = friends * wantSlices;

        if (possibleSlices <= slices) {
            System.out.println("Yes, it's possible to split the pizza fairly.");
        } else {
            System.out.println("Sorry, it's not possible to split the pizza fairly.");
        }

        scanner.close();
    }
}
