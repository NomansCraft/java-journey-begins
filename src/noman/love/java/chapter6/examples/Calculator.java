package noman.love.java.chapter6.examples;

public class Calculator {

    public int performAddition(int a, int b) {
        int result = a + b;

        return result;
    }

    public int performSubtraction(int a, int b) {
        int result = a - b;

        return result;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.performAddition(34, 53));
        System.out.println(calculator.performSubtraction(64, 34));
    }
}
