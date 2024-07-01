package noman.love.java.chapter4.exercises;

public class exercise2 {

    public static void main(String[] args) {
        int rows = 10;

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < i; j++) {
                int numberPrint = 0 + i;
                System.out.print(numberPrint + " ");
            }
            System.out.println();
        }
    }
}
