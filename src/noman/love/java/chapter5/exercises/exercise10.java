package noman.love.java.chapter5.exercises;

import java.util.Scanner;

public class exercise10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] yearlyTemperatures = new int[1][365];

        for (int i = 0; i < yearlyTemperatures.length; i++) {
            for (int j = 0; j < yearlyTemperatures[i].length; j++) {
                System.out.printf("int[%d][%d] = ", i, j);
                yearlyTemperatures[i][j] = scanner.nextInt();
            }
        }

        scanner.close();

    }
}
