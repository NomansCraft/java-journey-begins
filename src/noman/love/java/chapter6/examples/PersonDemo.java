package noman.love.java.chapter6.examples;

public class PersonDemo {

    public static void main(String[] args) {
        Person noman = new Person("Noman", "mr.noman1971@gmail.com", 38);
        Person monir = new Person("Lenin");
        Person ohiduzzaman = new Person("Md. Ohiduzzaman", "example@gmail.com");

        noman.printInfo();
        monir.printInfo();
        ohiduzzaman.printInfo();
    }
}
