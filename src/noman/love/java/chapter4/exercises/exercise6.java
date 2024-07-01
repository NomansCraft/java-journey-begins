package noman.love.java.chapter4.exercises;

import java.util.Scanner;

public class exercise6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many product did you buy?");
        int totalItems = input.nextInt();

        int totalPrice = 0;
        System.out.println("Enter their price one by one: ");
        for (int i = 0; i < totalItems; i++) {
            int itemPrice = input.nextInt();
            totalPrice += itemPrice;
        }

        totalPrice = totalPrice * 115 / 100;
        System.out.println("Total price with tax: " + totalPrice);

        int remainingMoney = totalPrice;
        int pay = 0;

        while (pay < totalPrice) {
            System.out.println("Please pay the money: ");
            int payment = input.nextInt();
            pay += payment;

            if (pay < totalPrice) {
                remainingMoney = totalPrice - pay;
                System.out.println("You have to pay more: " + remainingMoney);
            } else if (pay > totalPrice) {
                remainingMoney = pay - totalPrice;
                System.out.println("Here is your change: " + remainingMoney);
            }
        }

        if (pay == totalPrice) {
            System.out.println("Payment complete. Thank you!");
        }

        input.close();
    }
}
