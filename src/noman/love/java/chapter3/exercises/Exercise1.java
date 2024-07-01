package noman.love.java.chapter3.exercises;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter 1st number:");
        int firstNum = userInput.nextInt();

        System.out.println("Enter 2nd number:");
        int secondNum = userInput.nextInt();

        System.out.println("Enter 3rd number:");
        int thirdNum = userInput.nextInt();

        System.out.println("Enter 4th number:");
        int forthNum = userInput.nextInt();

        if ((firstNum == secondNum) && (secondNum == thirdNum) && (thirdNum == forthNum)) {
            System.out.println("All are equal");
        } else {
            System.out.println("Not equal");
        }
    }
}
