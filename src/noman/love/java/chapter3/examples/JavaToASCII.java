package noman.love.java.chapter3.examples;

import java.util.Scanner;

public class JavaToASCII {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char aChar = userInput.next().charAt(0);
        int asciiValue = aChar;
        System.out.println("ASCII value of " + aChar + " = " + asciiValue);
    }
}
