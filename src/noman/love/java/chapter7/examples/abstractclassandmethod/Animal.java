package noman.love.java.chapter7.examples.abstractclassandmethod;

public abstract class Animal {
    private final int legs;
    private String name;

    public Animal (int legs, String name) {
        this.legs = legs;
        this.name = name;
    }

    public abstract String getDiet();

    @Override
    public String toString() {
        return (name + " has " + legs + " leg(s)");
    }
}
