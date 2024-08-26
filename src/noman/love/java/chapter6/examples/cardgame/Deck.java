package noman.love.java.chapter6.examples.cardgame;

public class Deck {
    private final Card[] cards;
    private int cardsUsed;

    public Deck() {
        this.cards = new Card[52];
        initializaDeck();
    }

    private void initializaDeck() {
        int count = 0;

        // Hearts
        for (int i = 1; i <= 13; i++) {
            cards[count++] = new Card(i, Suit.HEARTS);
        }

        // Clubs
        for (int i = 1; i <= 13; i++) {
            cards[count++] = new Card(i, Suit.CLUBS);
        }

        // Diamonds
        for (int i = 1; i <= 13; i++) {
            cards[count++] = new Card(i, Suit.DIAMONDS);
        }

        // Spades
        for (int i = 1; i <= 13; i++) {
            cards[count++] = new Card(i, Suit.SPADES);
        }
    }

    public void shuffle() {
        for (int i = 1; i <= cards.length - 1; i++) {
            int rand = (int) (Math.random() * (i + 1));
            Card temp = cards[i];
            cards[i] = cards[rand];
            cards[rand] = temp;
        }

        cardsUsed = 0;
    }

    public Card dealCard() {
        cardsUsed++;
        return cards[cardsUsed - 1];
    }
}
