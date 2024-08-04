package noman.love.java.chapter6.examples;

public class Student {
    private final String name;
    private final double[] marks;

    public Student(String name, double[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public double average() {
        return totalMarks() / marks.length;
    }

    public double totalMarks() {
        double totalmarks = 0.0;
        for (double mark : marks) {
            totalmarks += mark;
        }
        return totalmarks;
    }
}
