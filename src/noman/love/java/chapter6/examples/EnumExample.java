package noman.love.java.chapter6.examples;

enum Day {
    SATURDAY,
    SUNDAY,
    MONDAY,
    TUESDAY,
    THURSDAY,
    FRIDAY
}
public class EnumExample {

    public void displayDay(Day day) {
        if (day == Day.SATURDAY) {
            System.out.println("Its saturday, Weekend!");
        } else if (day == Day.FRIDAY) {
            System.out.println("It's friday, Weekend!");
        } else {
            System.out.println("Weekday!");
        }
    }

    public static void main(String[] args) {
        EnumExample enumExample = new EnumExample();
        Day day = Day.SATURDAY;
        enumExample.displayDay(day);
    }
}
