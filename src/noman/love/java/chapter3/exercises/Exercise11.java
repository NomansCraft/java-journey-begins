package noman.love.java.chapter3.exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks for Bangla: ");
        double banglaMarks = scanner.nextDouble();
        System.out.print("Enter marks for English: ");
        double englishMarks = scanner.nextDouble();
        System.out.print("Enter marks for Mathematics: ");
        double mathematicsMarks = scanner.nextDouble();
        System.out.print("Enter marks for Science: ");
        double scienceMarks = scanner.nextDouble();
        System.out.print("Enter marks for Physics: ");
        double physicsMarks = scanner.nextDouble();
        System.out.print("Enter marks for Religion: ");
        double religionMarks = scanner.nextDouble();

        double totalMarks = banglaMarks + englishMarks + physicsMarks + religionMarks + mathematicsMarks + scienceMarks;
        double averageMarks = totalMarks / 6;
        double totalPossibleMarks = 600;
        double percentage = (totalMarks / totalPossibleMarks) * 100;

        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String formatedTotalMarks = decimalFormat.format(totalMarks);
        String formatedAverageMarks = decimalFormat.format(averageMarks);
        String formatedPercentage = decimalFormat.format(percentage);

        System.out.println("Total = " + formatedTotalMarks);
        System.out.println("Average = " + formatedAverageMarks);
        System.out.println("Percentage = " + formatedPercentage + "%");

        scanner.close();
    }
}
