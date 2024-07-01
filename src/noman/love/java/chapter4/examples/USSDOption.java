package noman.love.java.chapter4.examples;

import java.util.Scanner;

public class USSDOption {

    public static void main(String[] args) {
        System.out.println("""
                0. Download MyGP
                1. Balance, Call Rate & FnF
                2. GP STAR
                3. Internet Pack
                4. Talk Time/ Minutes Pack
                5. My Offers
                6. Welcome Tune""");

        System.out.print("Select an option for (0 ot 6): ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number == 0) {
            System.out.println("Downloading MyGP.");
        } else if (number == 1) {
            System.out.println("You don't have sufficient balance, recharge now.");
        } else if(number == 2) {
            System.out.println("Your sunding privileged!");
        } else if (number == 3) {
            System.out.println("1GB at Tk. 38");
        } else if (number == 4) {
            System.out.println("You have 100 minutes free talktime, use them.");
        } else if (number == 5) {
            System.out.println("You don't have any offer, migrate to another provider!");
        } else if (number == 6) {
            System.out.println("We are out of service at the moment.");
        } else {
            System.out.println("You pressed wrong code");
        }
    }
}
