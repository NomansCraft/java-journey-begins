package noman.love.java.chapter4.examples;

public class FloatingPintCompare {

    public static void main(String[] args) {
        double a = 0.3;
        double b = 0.1 + 0.1 + 0.1;
        double epsilon = 0.0000000000001;

        if (Math.abs(a - b) < epsilon) {
            System.out.println("Both of them are equal.");
        } else {
            System.out.println("The are not equal.");
        }
    }
}
