package noman.love.java.chapter7.examples.abstractclassandmethod;

public class Lion extends Animal {
    public Lion() {
        super(4, "Lion");
    }

    @Override
    public String getDiet() {
        return "Meat";
    }
}
