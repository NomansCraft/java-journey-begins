package noman.love.java.chapter3.examples;

import java.util.Scanner;

public class isEven {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        boolean isEven = number % 2 == 0;
        System.out.println("Is Even: " + isEven);

        boolean isTrue = true;
        boolean isFalse = !isTrue;
        System.out.println("isTrue: " + isTrue);
        System.out.println("isFalse: " + isFalse);
    }
}
