package noman.love.java.chapter7.examples.upcastinganddowncasting;

public class DogWalker {
    public void walk(Dog dog) {
        if (dog instanceof Poodle poodle) {
            System.out.println("Walking " + poodle.getName());
        } else {
            System.out.println("Walking " + dog.getBreed());
        }
    }
}
