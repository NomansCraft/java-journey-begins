package noman.love.java.chapter2.exercises;

import java.util.Scanner;

public class Exercise08 {

    public static void main(String[] args) {
        int winPoint = 3;
        int drawPoint = 1;
        int lossePoint = 0;

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter wins: ");
        int wins = userInput.nextInt();

        System.out.print("Enter draws: ");
        int draws = userInput.nextInt();

        System.out.print("Enter losses: ");
        int losses = userInput.nextInt();

        int totalPoint = (winPoint * wins) + (drawPoint * draws) + (lossePoint * losses);

        System.out.println("Total point = " + totalPoint);
    }
}
