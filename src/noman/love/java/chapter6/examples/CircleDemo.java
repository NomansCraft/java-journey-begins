package noman.love.java.chapter6.examples;

public class CircleDemo {

    public static class Circle {
        private int radius;
        private static final double PI = 3.1416;

        public Circle(int radius) {
            this.radius = radius;
        }

        public double getArea() {
            return radius * radius * PI;
        }
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(15);

        System.out.println("area of circle1 = " + circle1.getArea());
        System.out.println("area of circle2 = " + circle2.getArea());
    }
}
