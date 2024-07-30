package noman.love.java.chapter5.examples;

import java.util.Scanner;

public class StringInput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a line: ");
        String inputValue = input.nextLine();
        inputValue = inputValue.toLowerCase();
        char[] letters = inputValue.toCharArray();

        System.out.println("Value = " + inputValue);

        input.close();
    }
}
