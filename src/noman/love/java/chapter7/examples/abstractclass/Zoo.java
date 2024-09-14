package noman.love.java.chapter7.examples.abstractclass;

public class Zoo {
    private Animal[] animals;

    public Zoo(Animal[] animals) {
        this.animals = animals;
    }

    public void printInfo() {
        for (Animal animal : animals) {
            System.out.println(animal.toString());
        }
    }
}
