package noman.love.java.chapter6.examples.cardgame;

public enum Suit {
    DIAMONDS("\u2666"),
    HEARTS("\u2665"),
    CLUBS("\u2663"),
    SPADES("\u2660");

    private final String value;

    Suit(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
