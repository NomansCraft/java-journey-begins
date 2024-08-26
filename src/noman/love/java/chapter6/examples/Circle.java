package noman.love.java.chapter6.examples;

public class Circle {
    private static final double PI = 3.1416;
    private static int numberOfObjectCreated = 0;
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
        numberOfObjectCreated++;
    }

    public int getNumberOfObjectCreated() {
        return numberOfObjectCreated;
    }

    public double getArea() {
        return radius * radius * PI;
    }
}