package noman.love.java.chapter5.exercises;

import java.util.Arrays;

public class RemoveOddNumbers {

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Remove odd numbers
        int[] evenArray = removeOddNumbers(originalArray);

        System.out.println("Original array: " + Arrays.toString(originalArray));
        System.out.println("New Array with even number: " + Arrays.toString(evenArray));
    }

    public static int[] removeOddNumbers(int[] array) {
        int count = 0;

        // Count even numbers
        for (int num : array) {
            if (num % 2 == 0) {
                count++;
            }
        }

        // Create a new array to store even numbers
        int[] result = new int[count];
        int index = 0;

        // Populate the new array with even numbers
        for (int num : array) {
            if (num % 2 == 0) {
                result[index++] = num;
            }
        }

        return result;
    }
}
