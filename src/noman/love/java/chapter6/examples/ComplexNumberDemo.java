package noman.love.java.chapter6.examples;

public class ComplexNumberDemo {

    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(5.0, 6.0);
        ComplexNumber b = new ComplexNumber(-3.0, 4.0);

        System.out.println("a               = " + a);
        System.out.println("b               = " + b);
        System.out.println("a + b           = " + a.plus(b));
        System.out.println("a - b           = " + a.minus(b));
    }
}
