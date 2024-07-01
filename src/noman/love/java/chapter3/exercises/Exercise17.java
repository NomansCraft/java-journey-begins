package noman.love.java.chapter3.exercises;

import java.util.Scanner;

public class Exercise17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Seconds: ");
        int totalSeconds = scanner.nextInt();

        int secondsInHours = totalSeconds / (60 * 60);
        int remainingSeconds = totalSeconds % (60 * 60);
        int secondsInMinutes = remainingSeconds / 60;
        remainingSeconds = remainingSeconds % 60;

        System.out.printf("%d hour(s) %d minute(s) %d second(s)", secondsInHours, secondsInMinutes, remainingSeconds);

        scanner.close();
    }
}
