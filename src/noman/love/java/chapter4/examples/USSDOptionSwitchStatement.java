package noman.love.java.chapter4.examples;

import java.util.Scanner;

public class USSDOptionSwitchStatement {

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

        switch (number) {
            case 0:
                System.out.println("Downloading MyGP");
                break;
            case 1:
                System.out.println("You don't have sufficient balance, recharge now");
                break;
            case 2:
                System.out.println("Your sunding privileged!");
                break;
            case 3:
                System.out.println("1GB at Tk. 38");
                System.out.println("5GB at Tk. 299");
                break;
            case 4:
                System.out.println("You have 100 minutes free talktime, use them.");
                break;
            case 5:
                System.out.println("You dont't have any offer, migrate to another provider!");
                break;
            case 6:
                System.out.println("We are not service at time moment");
                break;
            default:
                System.out.println("You pressed wrong code.");
                break;
        }
    }
}
