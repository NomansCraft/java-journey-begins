package noman.love.java.chapter5.examples;

import java.util.Arrays;

public class DefaultValueOfArray {
    public static void main(String[] args) {
        int[] ints = new int[5];
        System.out.println("ints = " + Arrays.toString(ints));

        Integer[] integers = new Integer[5];
        System.out.println("Integer = " + Arrays.toString(integers));

        float[] floats = new float[5];
        System.out.println("floats = " + Arrays.toString(floats));
    }
}
