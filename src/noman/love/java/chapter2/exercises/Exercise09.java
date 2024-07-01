package noman.love.java.chapter2.exercises;

import java.util.Scanner;

public class Exercise09 {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter length: ");
        int lengthValue = userInput.nextInt();

        System.out.print("Enter width: ");
        int widthValue = userInput.nextInt();

        System.out.print("Enter height: ");
        int heightValue = userInput.nextInt();

        int volume = lengthValue * widthValue * heightValue;

        System.out.println("Volume: " + volume);
    }
}
