package noman.love.java.chapter3.exercises;

import java.util.Scanner;

public class Exercise12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char inputChar = scanner.next().charAt(0);

        boolean isDigit = Character.isDigit(inputChar);
        boolean isLetter = Character.isLetter(inputChar);

        if (isDigit) {
            System.out.println("The character is a digit");
        } else if (isLetter) {
            System.out.println("The character is a letter");
        } else {
            System.out.println("The character is a special character");
        }

        scanner.close();
    }
}
