package noman.love.java.chapter5.exercises;

import java.util.Scanner;

public class exercise11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] countryInfo = new String[3][4];

        for (int i = 0; i < countryInfo.length; i++) {
            System.out.println("Enter information for country " + (i + 1) + ":");

            System.out.print("Enter country name: ");
            countryInfo[i][0] = scanner.next();

            System.out.printf("Enter capital of %s: ", countryInfo[i][0]);
            countryInfo[i][1] = scanner.next();

            System.out.printf("Enter currency of %s: ", countryInfo[i][0]);
            countryInfo[i][2] = scanner.next();

            System.out.printf("Enter language of %s: ", countryInfo[i][0]);
            countryInfo[i][3] = scanner.next();
        }

        System.out.println("Collected country information:");
        for (int i = 0; i < countryInfo.length; i++) {
            System.out.printf("Country %d: name: %s, Capital: %s, Currency: %s, Language: %s%n",
                    i + 1, countryInfo[i][0], countryInfo[i][1], countryInfo[i][2], countryInfo[i][3]);
        }
        scanner.close();
    }
}
