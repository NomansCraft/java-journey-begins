package noman.love.java.chapter3.examples;

import java.util.Scanner;

public class CelsiusToFahrenheit {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter celsius value: ");
        double celciusValue = userInput.nextDouble();
        
        double fahrenheitValue = (celciusValue * 9 / 5) + 32;

        System.out.println("Temperature in fahrenheit : " + fahrenheitValue);
    }
}
