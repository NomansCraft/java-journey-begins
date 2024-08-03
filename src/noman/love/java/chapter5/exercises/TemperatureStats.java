package noman.love.java.chapter5.exercises;

public class TemperatureStats {

    public static void main(String[] args) {
        double[][] temperatures = new double[64][12];
        demoData(temperatures);

        double yearlyAverage = yearlyAverage(temperatures);
        double minTemperature = findMinTemperature(temperatures);
        double maxTemperature = findMaxTemperature(temperatures);

        System.out.printf("Yearly average temperature: %.2f%n", yearlyAverage);
        System.out.printf("Minimum temperature: %.2f%n", minTemperature);
        System.out.printf("Maximum temperature: %.2f%n", maxTemperature);

    }

    private static void demoData(double[][] temperatures) {
        for (int district = 0; district < temperatures.length; district++) {
            for (int month = 0; month <temperatures[district].length; month++) {
                temperatures[district][month] = Math.random() * 50;
            }
        }
    }

    private static double yearlyAverage(double[][] temperatures) {
        double total = 0;
        int count = 0;

        for (int district = 0; district < temperatures.length; district++) {
            for (int month = 0; month < temperatures[district].length; month++) {
                total += temperatures[district][month];
                count++;
            }
        }

        return total / count;
    }

    private static double findMinTemperature(double[][] temperatures) {
        double min = Double.MAX_VALUE;

        for (int district = 0; district < temperatures.length; district++) {
            for (int month = 0; month < temperatures[district].length; month++) {
                if (temperatures[district][month] < min) {
                    min =temperatures[district][month];
                }
            }
        }

        return min;
    }

    private static double findMaxTemperature(double[][] temperatures){
        double max = Double.MIN_VALUE;

        for (int district = 0; district < temperatures.length; district++) {
            for (int month = 0; month < temperatures[district].length; month++) {
                if (temperatures[district][month] > max) {
                    max = temperatures[district][month];
                }
            }
        }
        return max;
    }
}
