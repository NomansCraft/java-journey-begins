package noman.love.java.chapter6.examples;

public class CircleDemo2 {

    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(15);
        Circle circle3 = new Circle(20);

        System.out.println("circle1 = " + circle1.getNumberOfObjectCreated());
        System.out.println("circle1 = " + circle2.getNumberOfObjectCreated());
        System.out.println("circle1 = " + circle3.getNumberOfObjectCreated());
    }
}
