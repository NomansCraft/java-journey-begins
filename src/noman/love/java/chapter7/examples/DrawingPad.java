package noman.love.java.chapter7.examples;

public class DrawingPad {
    public void draw(Shape shape) {
        String actualType = shape.getClass().getTypeName();
        System.out.println("Actual type: " + actualType);
        System.out.println("Drawing " + shape.getName());
    }

    public static void main(String[] args) {
        DrawingPad pad = new DrawingPad();
        Circle circle = new Circle();
        Square shape = new Square();

        pad.draw(circle);
        pad.draw(shape);
    }
}
