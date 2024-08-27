package noman.love.java.chapter7.examples;

public class Bicycle {
    public int cadence;
    public int gear;
    public int speed;

    public void setCadence(int newValue) {
        cadence = newValue;
    }

    public void setGear(int newValue) {
        gear = newValue;
    }

    public void applyBeak(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }
}
