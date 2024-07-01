package noman.love.java.chapter3.examples;

public class SwapVariable {

    public static void main(String[] args) {
        int x = 2;
        int y = 22;

        x = x ^ y;
        y = x ^ y;
        x = x ^ y;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
