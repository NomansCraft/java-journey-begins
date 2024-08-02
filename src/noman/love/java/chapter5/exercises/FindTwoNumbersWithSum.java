package noman.love.java.chapter5.exercises;

import java.util.Scanner;

public class FindTwoNumbersWithSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array: ");
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Enter the target sum (n): ");
        int targetSum = scanner.nextInt();

        findTwoNumbersWithSum(array, targetSum);

        scanner.close();
    }

    public static void findTwoNumbersWithSum(int[] array, int targetSum) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == targetSum) {
                    System.out.println("Found numbers: " + array[i] + " and " + array[j]);
                    return;
                }
            }
        }
        System.out.println("No two numbers found with the given sum.");
    }
}
