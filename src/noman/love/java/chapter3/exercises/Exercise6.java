package noman.love.java.chapter3.exercises;

import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter distance in meters:");
        double distanceInMeter = scanner.nextDouble();

        System.out.println("Enter time taken in minutes:");
        double timeInMinutes = scanner.nextDouble();

        double timeInHour = timeInMinutes / 60;
        double distanceInKilometer = distanceInMeter / 1000;

        double speedPerHour = distanceInKilometer / timeInHour;
        double speedPerSecond = speedPerHour / 3600;

        System.out.printf("Speed in km/h is: %.2f%n", speedPerHour);
        System.out.printf("Speed in km/s is: %.6f%n", speedPerSecond);

        scanner.close();
    }
}
