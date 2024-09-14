package noman.love.java.chapter7.examples.abstractclassandmethod;

public class Tiger extends Animal {
    public Tiger() {
        super(4, "Tiger");
    }

    @Override
    public String getDiet() {
        return "Meat";
    }
}
