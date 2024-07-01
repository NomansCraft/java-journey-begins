package noman.love.java.chapter4.exercises;

public class exercise3 {

    public static void main(String[] args) {
        int rows = 6;

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(". ");
            }

            for (int k = 0; k < rows - i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
