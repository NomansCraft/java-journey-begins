package noman.love.java.chapter3.examples;

public class NarrowingPrimitiveConversionTest {

    public static void main(String[] args) {
        long y = 1_233_720_377_580L;
        System.out.println("Long value: " + y);

        int x = (int) y;
        System.out.println("After Narrowing Primitive Conversion: " + x);
    }
}
