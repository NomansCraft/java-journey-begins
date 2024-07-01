package noman.love.java.chapter3.examples;

public class StringDemo {

    public static void main(String[] args) {
        String nationalAnthemLineOne = "My bengal o precious gold, I love you. ";
        String nationalAnthemLineTwo = "Forever your skies, your air set my heart in tune\n" +
                "As if it ware a flute.";
        String nationalAnthem = nationalAnthemLineOne + nationalAnthemLineTwo;

        System.out.println(nationalAnthemLineOne);
        System.out.println(nationalAnthemLineTwo);
        System.out.println(nationalAnthem);

        System.out.println(5 + 3 + " ABCD");
        System.out.println(5 + 3 * 2 + " ABCD");
        System.out.println("ABCD " + 5 + 3);
        System.out.println("ABCD " + 5 + 3 * 2);
        System.out.println("ABCD " + (5 + 3));
        System.out.println("ABCD " + (5 + 3 * 2));
    }
}
