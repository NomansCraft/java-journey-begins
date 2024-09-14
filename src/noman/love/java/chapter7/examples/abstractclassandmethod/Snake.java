package noman.love.java.chapter7.examples.abstractclassandmethod;

public class Snake extends Animal {
    public Snake() {
        super(0, "Snake");
    }

    @Override
    public String getDiet() {
        return "Bugs";
    }
}
