package noman.love.java.chapter3.examples;

public class AutoBoxingExample {

    public Integer add(Integer a, Integer b) {
        return a + b;
    }

    public static void main(String[] args) {
        AutoBoxingExample example = new AutoBoxingExample();
        int a = 5;
        int b = 15;
        System.out.println(example.add(a, b));
    }
}
