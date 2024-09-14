package noman.love.java.chapter7.examples.abstractclassandmethod;

public class Deer extends Animal {
    public Deer() {
        super(4, "Deer");
    }

    @Override
    public String getDiet() {
        return "Grass";
    }
}
