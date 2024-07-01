package noman.love.java.chapter4.exercises;

import java.util.Scanner;

public class exercise {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        System.out.print("Enter third number: ");
        int num3 = input.nextInt();
        System.out.print("Enter forth number: ");
        int num4 = input.nextInt();

        int bigNumber = num1;
        int smallNumber = num1;

        if (num2 > bigNumber) {
            bigNumber = num2;
        }
        if (num3 > bigNumber) {
            bigNumber = num3;
        }
        if (num4 > bigNumber) {
            bigNumber = num4;
        }

        if (num2 < smallNumber) {
            smallNumber = num2;
        }
        if (num3 < smallNumber) {
            smallNumber = num3;
        }
        if (num4 < smallNumber) {
            smallNumber = num4;
        }

        System.out.println("Big number: " + bigNumber);
        System.out.println("Small number: " + smallNumber);
    }
}
