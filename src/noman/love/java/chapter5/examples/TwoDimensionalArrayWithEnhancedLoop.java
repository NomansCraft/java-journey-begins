package noman.love.java.chapter5.examples;

public class TwoDimensionalArrayWithEnhancedLoop {

    public static void main(String[] args) {
        int[][] array = new int[12][8];

        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                array[row][column] = row * column + 1;
            }
        }

        for (int[] rowArray : array) {
            for (int element : rowArray) {
                System.out.printf("%3d", element);
            }
            System.out.println();
        }
    }
}
