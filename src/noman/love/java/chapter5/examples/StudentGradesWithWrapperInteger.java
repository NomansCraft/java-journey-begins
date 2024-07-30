package noman.love.java.chapter5.examples;

public class StudentGradesWithWrapperInteger {
    public static void main(String[] args) {
        Integer[] grades = new Integer[5];
        // Assigning grades (some students haven't taken the exam yet)
        grades[0] = 85;
        grades[1] = 90;
        grades[3] = 92;
        grades[4] = 88;

        // Calculating the average grade
        int sum = 0;
        int count = 0;

        for (Integer grade : grades) {
            if (grade != null) {
                sum += grade;
                count++;
            }
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Average grade: " + average);
        } else {
            System.out.println("No grades available.");
        }
    }
}
