package noman.love.java.chapter5.exercises;

import java.util.Scanner;

public class FindMinAndMax {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int arraySize = input.nextInt();

        if (arraySize <= 0) {
            System.out.println("The number of elements shoul be greater than zero.");
            return;
        }

        int[] numbers = new int[arraySize];

        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Enter number (%d of %d): ", i +1, arraySize);
            numbers[i] = input.nextInt();
        }

        int minNumber= numbers[0];
        int maxNumber = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < minNumber) {
                minNumber = numbers[i];
            }

            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }

        System.out.println("Maximum number of the array is: " + maxNumber);
        System.out.println("Minimum number of the array is: " + minNumber);

        input.close();
    }
}
