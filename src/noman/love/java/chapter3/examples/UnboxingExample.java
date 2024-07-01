package noman.love.java.chapter3.examples;

public class UnboxingExample {

    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        UnboxingExample example = new UnboxingExample();

        Integer a = 5;
        Integer b = 15;
        System.out.println(example.add(a, b));
    }
}
