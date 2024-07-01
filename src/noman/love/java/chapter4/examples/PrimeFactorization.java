package noman.love.java.chapter4.examples;

import java.util.Scanner;

public class PrimeFactorization {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = input.nextLong();

        System.out.println("Prime factors of " + n + " are: ");

        // No factors would exist beyond
        // (n/1) for a particular factor
        for (long i = 2; i < n / i; i++ ) {
            while (n % i == 0) {
                // If i is a factor
                System.out.print(i + " ");
                // Divide n by i, else we won't get a prime number
                n = n / i;
            }
        }

        if (n > 1) {
            System.out.println(n);
        }
    }
}
