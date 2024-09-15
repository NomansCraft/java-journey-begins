package noman.love.java.chapter7.examples;

public class BkashPayment implements Payment {
    private final double amount;

    public BkashPayment(double amount) {
        this.amount = amount;
    }

    @Override
    public double getAmount() {
        System.out.println("Taking bKash payment");
        return amount;
    }
}
