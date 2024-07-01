package noman.love.java.chapter4.examples;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter operator (+ , -, * or /): ");
        char operator = input.next().charAt(0);

        System.out.print("Enter first number: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = input.nextInt();

        int result = switch (operator) {
          case '+' -> firstNumber + secondNumber;
          case '-' -> firstNumber - secondNumber;
          case '*' -> firstNumber * secondNumber;
          case '/' -> {
              if (secondNumber != 0) {
                  yield firstNumber / secondNumber;
              } else {
                  System.out.println("Error: Division by zero");
                  yield 0;
              }
          }
          default -> {
              System.out.println("Invalid value");
              yield 0;
          }
        };

        System.out.println("Result = " + result);

        input.close();
    }
}
