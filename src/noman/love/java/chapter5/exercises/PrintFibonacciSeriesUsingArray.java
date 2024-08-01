package noman.love.java.chapter5.exercises;

public class PrintFibonacciSeriesUsingArray {

    public static void main(String[] args) {
        int n = 10; // Number of Fibonacci numbers to generate
        int[] fibonacciArray = new int[n];

        // Initializing the first two numbers in the Fibonacci series
        fibonacciArray[0] = 0;
        fibonacciArray[1] = 1;

        /// Generating the rest of the Fibonacci series
        for (int i = 2; i < n; i++) {
            fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
        }

        // Printing the Fobonacci series
        System.out.println("Fibonacci series upto " + n + " terms:");
        for (int element : fibonacciArray) {
            System.out.print(element + " ");
        }
    }
}
