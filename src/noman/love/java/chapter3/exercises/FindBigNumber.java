package noman.love.java.chapter3.exercises;

import noman.love.java.common.CommonValue;

import java.util.Scanner;

public class FindBigNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(CommonValue.FIRST_VALUE_PROMT);
        double firstValue = scanner.nextDouble();

        System.out.println(CommonValue.SECOND_VALUE_PROMT);
        double secondValue = scanner.nextDouble();

        System.out.println(CommonValue.THIRD_VALUE_PROMT);
        double thirdValue = scanner.nextDouble();

        System.out.printf("First value is %.2f%n", firstValue);
        System.out.printf("Second value is %.2f%n", secondValue);
        System.out.printf("Third value is %.2f%n", thirdValue);
        System.out.printf("Maximum value is %.2f", findBigNumber(firstValue, secondValue, thirdValue));
    }

    public static double findBigNumber(double a, double b, double c) {
        double maxValue = a;

        if (b > maxValue) {
            maxValue = b;
        } else if (c > maxValue) {
            maxValue = c;
        }
        return maxValue;
    }
}
