package noman.love.java.chapter3.examples;

public class WideningPrimitiveConversion {

    public static void main(String[] args) {
        int anInt = 100;
        long aLong = anInt;
        float aFloat = aLong;

        System.out.println("Int value: " + anInt);
        System.out.println("Long value: " + aLong);
        System.out.println("Float value: " + aFloat);
    }
}
