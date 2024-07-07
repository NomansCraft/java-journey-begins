package noman.love.java.chapter5.examples;

import java.util.Scanner;

public class StringInput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a line: ");
        String value = input.nextLine();
        System.out.println("Value = " + value);

        input.close();
    }
}
