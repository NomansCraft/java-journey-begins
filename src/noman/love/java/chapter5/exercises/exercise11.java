package noman.love.java.chapter5.exercises;

import java.util.Scanner;

public class exercise11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] countryInfo = new String[3][4];

        for (int i = 0; i < countryInfo.length; i++) {
            System.out.println("Enter information for country " + (i + 1) + ":");

            System.out.println("Enter country name: ");
            countryInfo[i][0] = scanner.next().toLowerCase();

            System.out.println("Enter capital of " + countryInfo[i][0] + ":");
            countryInfo[i][1] = scanner.next().toLowerCase();

            System.out.println("Enter currency of " + countryInfo[i][0] + ":");
            countryInfo[i][2] = scanner.next().toLowerCase();

            System.out.println("Enter language of " + countryInfo[i][0] + ":");
            countryInfo[i][3] = scanner.next().toLowerCase();
        }

        System.out.println("Collected country information:");
        for (int i = 0; i < countryInfo.length; i++) {
            System.out.printf("Country %d: Name: %s, Capital: %s, Currency: %s, Language: %s%n",
                    i + 1, countryInfo[i][0], countryInfo[i][1], countryInfo[i][2], countryInfo[i][3]);
        }

        System.out.println();
        // Question section
        int correctAnswer = 0;
        int wrongAnswer = 0;

        for (int i = 0; i < countryInfo.length; i++) {
            // First Question
            System.out.println("Q: What is the capital of " + countryInfo[i][0] + "?");
            String answer = scanner.next().toLowerCase();
            if (answer.equals(countryInfo[i][1])) {
                System.out.println("✔ Well Done!");
                correctAnswer++;
            } else {
                System.out.println("✖ The correct answer should be " + countryInfo[i][1]);
                wrongAnswer++;
            }

            // Second Question
            System.out.println("Q: What is the currency of "+ countryInfo[i][0] + "?");
            answer = scanner.next().toLowerCase();
            if (answer.equals(countryInfo[i][2])) {
                System.out.println("✔ Well Done!");
                correctAnswer++;
            } else {
                System.out.println("✖ The correct answer should be " + countryInfo[i][2]);
                wrongAnswer++;
            }

            // Third Question
            System.out.println("Q: What is the language of " + countryInfo[i][0] + "?");
            answer = scanner.next().toLowerCase();
            if (answer.equals(countryInfo[i][3])) {
                System.out.println("✔ Well Done!");
                correctAnswer++;
            } else {
                System.out.println("✖ The correct answer should be " + countryInfo[i][3]);
                wrongAnswer++;
            }

        }

        System.out.println("-------------------------");
        System.out.println("Total correct answer: " + correctAnswer);
        System.out.println("Total wrong answer: " + wrongAnswer);
        scanner.close();
    }
}
