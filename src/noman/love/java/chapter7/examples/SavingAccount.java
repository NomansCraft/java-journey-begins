package noman.love.java.chapter7.examples;

public class SavingAccount extends CheckingAccount {
    private final double interestRate;

    public SavingAccount(int initialBalance, String accountNumber, double interestRate) {
        super(initialBalance, accountNumber);
        this.interestRate = interestRate;
    }
}
