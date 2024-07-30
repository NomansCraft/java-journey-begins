package noman.love.java.chapter5.examples;

public class StudentGrades {
    public static void main(String[] args) {
        int[] grades = new int[5];

        //Assigning grades
        grades[0] = 85;
        grades[1] = 90;
        grades[2] = 78;
        grades[3] = 92;
        grades[4] = 88;

        // Calculating th average grade
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }

        double average = (double) sum / grades.length;
        System.out.println("Average grade: " + average);

    }
}
