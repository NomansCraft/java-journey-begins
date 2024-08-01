package noman.love.java.chapter5.exercises;

import java.util.Arrays;
import java.util.Collections;

public class SortingIntegerArray {

    public static void main(String[] args) {
         int[] myArray = {50, 20, 40, 10, 30};
         // Create an Integer array of the same length
         Integer[] myArray2 = new Integer[myArray.length];

         // Convert each int element to Integer and copy to the new array
        for (int i = 0; i < myArray.length; i++) {
            myArray2[i] = myArray[i];
        }

         // Print the original array
        System.out.println("Original array: " + Arrays.toString(myArray));
        System.out.println("Original array2: " + Arrays.toString(myArray2));

        // Sort the array
        Arrays.sort(myArray);

        // Print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(myArray));

        // Sort the array in descending order
        Arrays.sort(myArray2, Collections.reverseOrder());

        // Print the sorted [descending] array
        System.out.println("Sorted array (descending): " + Arrays.toString(myArray));
        System.out.println("Sorted array2 (descending): " + Arrays.toString(myArray2));
    }
}
