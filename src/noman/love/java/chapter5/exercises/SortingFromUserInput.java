package noman.love.java.chapter5.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class SortingFromUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Size of array: ");
        int arraySize = scanner.nextInt();
        int[] numbers = new int[arraySize];


        for (int i = 0; i < arraySize; i++) {
            System.out.printf("Enter your number (%d of %d): ", i + 1, arraySize);
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Your unsorted numbers is: " + Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println("Your sorted array is: " + Arrays.toString(numbers));

        scanner.close();
    }
}
