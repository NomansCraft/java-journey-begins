package noman.love.java.chapter7.examples.upcastinganddowncasting;

public class DogDemo {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Poodle();
        Dog dog3 = new Bulldog();

        DogWalker dogWalker = new DogWalker();
        dogWalker.walk(dog1);
        dogWalker.walk(dog2);
        dogWalker.walk(dog3);
    }
}
