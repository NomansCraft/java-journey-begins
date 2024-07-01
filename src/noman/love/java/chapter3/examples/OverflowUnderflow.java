package noman.love.java.chapter3.examples;

public class OverflowUnderflow {

    public static void main(String[] args) {
        int a = Integer.MAX_VALUE;
        System.out.println("Max value: " + a);
        a = a + 1;
        System.out.println("Overflow value: " +a);

        int b = Integer.MIN_VALUE;
        System.out.println("Min value: " + b);
        b = b - 1;
        System.out.println("Underflow value: " + b);
    }
}
