package noman.love.java.chapter5.examples;

public class RaggedArray {

    public static void main(String[] args) {
        int[][] array = {
                {5, 2, 3, 4, 5},
                {3, 3, 4, 5},
                {1, 3, 5},
                {4, 5},
                {5},
        };

        for (int[] arrayRow : array) {
            for (int element : arrayRow){
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
