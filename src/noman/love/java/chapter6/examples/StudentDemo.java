package noman.love.java.chapter6.examples;

public class StudentDemo {

    public static void main(String[] args) {
        Student inaiya = new Student("Inaiya", new double[] {97.45, 95.75, 100});
        double totalMarks = inaiya.totalMarks();
        double average = inaiya.average();

        System.out.printf("Total marks = %.2f%n", totalMarks);
        System.out.printf("Average marks = %.2f", average);
    }


}
