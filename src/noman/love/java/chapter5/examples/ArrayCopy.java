package noman.love.java.chapter5.examples;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] myArray = {1, 3, 5, 2, 4, 10};
        int[] copyTo = new int[myArray.length];
        System.out.println("'copyTo' array before copy: " + Arrays.toString(copyTo));

        for (int i = 0; i < myArray.length; i++) {
            copyTo[i] = myArray[i];
        }

        System.out.println("'copyTo' array after copy: " + Arrays.toString(copyTo));
    }
}
