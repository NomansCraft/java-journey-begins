package noman.love.java.chapter4.exercises;

public class exercise5 {

    public static void main(String[] args) {
        int a = 100;
        int x = 4;
        int y = 11;

        if (x > y) {
            a = 11;
            x = x++;
        }

        System.out.println(a);
    }
}
