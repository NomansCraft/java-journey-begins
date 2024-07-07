package noman.love.java.chapter5.examples;

import java.util.Scanner;

public class ArrayExample3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Length of array: ");
        int sizeOfArray = input.nextInt();

        int[] numbers = new int[sizeOfArray];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(i + ": " );
            numbers[i] = input.nextInt();
        }

        System.out.println("Index\tValue");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i + "\t\t" + numbers[i]);
        }
    }
}
