package noman.love.java.chapter7.examples;

public class Vehicle {
    int noOfWheels = 4;

    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.printWheels();
    }
}

class Bus extends Vehicle {
    int noOfWheels = 6;

    public void printWheels() {
        System.out.println("Number of wheels in Bus: " + noOfWheels);
        System.out.println("Number of wheels in Vehicle: " + super.noOfWheels);
    }
}
