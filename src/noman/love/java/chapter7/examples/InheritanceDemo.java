package noman.love.java.chapter7.examples;

public class InheritanceDemo {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        cat.makeSound();
        cat.sleep();

        Dog dog = new Dog();
        dog.eat();
        dog.bark();
        dog.sleep();
    }
}
