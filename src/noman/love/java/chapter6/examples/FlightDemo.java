package noman.love.java.chapter6.examples;

public class FlightDemo {

    public static void main(String[] args) {
        Flight flight = new Flight();
        flight.addOnePassenger();
        flight.addOnePassenger(2);
        flight.addOnePassenger(2, 2);

        int totalCheckedBags = flight.getTotalCheckedBags();
        System.out.println("Total checked bags = " + totalCheckedBags);

        int totalPassengerr = flight.getTotalPassengers();
        System.out.println("Total passenger = " + totalPassengerr);
    }
}
