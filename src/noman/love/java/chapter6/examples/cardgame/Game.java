package noman.love.java.chapter6.examples.cardgame;

import java.util.Scanner;

public class Game {

    private final Scanner input = new Scanner(System.in);

    private int correctGuesses = 0;

    public void play() {
        int gamesPlayed = 0;
        boolean playAgain;

        System.out.println("### High Low Prediction Card Game ###");
        do {
            correctGuesses = 0;
            keepPlayingUntilIncorrectGuess();
            gamesPlayed++;
            playAgain = askUserToPlayAgain();
        } while (playAgain);

        double averageScore = ((double) correctGuesses) / gamesPlayed;
        System.out.println();
        System.out.println("You played " + gamesPlayed + " game.");
        System.out.printf("Your average score was %1.3f.\n", averageScore);
    }

    private void keepPlayingUntilIncorrectGuess() {
        Deck deck = new Deck();
        deck.shuffle();

        Card currentCard = deck.dealCard();
        Card nextCard;
        System.out.println("The first card is: " + currentCard);

        boolean keepPlaying = true;
        while (keepPlaying) {
            char guess = askForUserInput();
            nextCard = deck.dealCard();
            System.out.println("The next card is" + nextCard);

            if (nextCard.getValue() == currentCard.getValue()) {
                System.out.println("The value is the same as " + "the previus card.");
                System.out.println("You lose in ties. Sorry!");
                keepPlaying = false;
            } else if (nextCard.getValue() > currentCard.getValue()) {
                if (guess == 'H') {
                    System.out.println("You guess was correct.");
                    correctGuesses++;
                } else {
                    System.out.println("Your guess was incorrect.");
                    keepPlaying = false;
                }
            } else {
                if (guess == 'L') {
                    System.out.println("Your guess was correct.");
                    correctGuesses++;
                } else {
                    System.out.println("Your guess was incorrect.");
                    keepPlaying = false;
                }
            }
            currentCard = nextCard;
            System.out.println();
            System.out.println("The card is: " + currentCard);
        }

        System.out.println();
        System.out.println("\uD83C\uDFAE the game over! " + "\uD83C\uDFAE");
        System.out.println("You made " + correctGuesses + " correct gusses");
        System.out.println();
    }

    private boolean askUserToPlayAgain() {
        System.out.println("Want to play again? If yes, please type YES, otherwise type anything else to exit.");
        return input.nextLine().toUpperCase().contains("YES");
    }

    private char askForUserInput() {
        System.out.println("Will the next card be higher (H) or Lower (L)");
        char guess;
        do {
            guess= input.nextLine().toUpperCase().charAt(0);
            if (guess != 'H' && guess != 'L') {
                System.out.println("Please type H or L: ");
            }
        } while (guess != 'H' && guess != 'L');
        return guess;
    }


}
