package noman.love.java.chapter4.exercises;

public class exercise1 {

    public static void main(String[] args) {
        int rows = 8; // Number of rows in the pyramid

        // Outer loop for number of rows
        for (int i = 1; i <= rows; i++) {

            // Inner loop for printing characters
            for (int j = 1; j <=i; j++) {
                char asciiChar = (char) (64 + i);
                System.out.print( asciiChar+ " "); // Print characters (A, B, C, D, ...)
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
