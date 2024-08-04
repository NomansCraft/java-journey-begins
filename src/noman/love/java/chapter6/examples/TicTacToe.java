package noman.love.java.chapter6.examples;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
    private static final char EMPTY_BOX = ' ';
    private static final char PLAYER_ONES_SYMBOL = 'X';
    private static final char PLAYER_TWOS_SYMBOL = '0';

    private final char[][] gameBoard = new char[3][3];

    private final Scanner input = new Scanner(System.in);

    private String playerOne;
    private String playerTwo;
    private String currentPlayer;
    private String whoWonTheGame;

    public void startGame() {
        initializedBoard();
        askForUserNames();

        while (isGameNotOver()) {
            drawBoard();
            printPlayerTurn();
            askForManuver();
        }

        printGameOver();
    }

    private void initializedBoard() {
        for (char[] chars : gameBoard) {
            Arrays.fill(chars, EMPTY_BOX);
        }
    }

    private void askForUserNames() {
        System.out.println("Welcome to Tic Tac Toe!");
        System.out.println("What's your name? ");
        playerOne = input.nextLine();

        System.out.println("Who are you playing with? ");
        playerTwo = input.nextLine();
        System.out.println("Who is playing first? press\n1 for " + playerOne + "\n2 for " + playerTwo);
        int player = input.nextInt();
        input.nextLine(); // Clear the newline character from the buffer
        currentPlayer = player == 1 ? playerOne : playerTwo;
    }

    private boolean isGameNotOver() {
        return !(isBoardFull() || hasAnyPlayerWon());
    }

    private void drawBoard() {
        for (char[] row : gameBoard) {
            System.out.println("---|---|---");
            System.out.printf("| %c | %c | %c |\n", row[0], row[1], row[2]);
        }
        System.out.println("---|---|---");
    }

    private void printPlayerTurn() {
        System.out.println(currentPlayer + "'s turn");
    }

    private void askForManuver() {
        int row, col;

        do {
            System.out.print("Enter a row number (0, 1, or 2): ");
            row = input.nextInt();
            System.out.print("Enter a column number (0, 1, or 2): ");
            col = input.nextInt();
        } while (!validateInput(row, col));

        if (currentPlayer.equals(playerOne)) {
            gameBoard[row][col] = PLAYER_ONES_SYMBOL;
            currentPlayer = playerTwo;
        } else {
            gameBoard[row][col] = PLAYER_TWOS_SYMBOL;
            currentPlayer = playerOne;
        }
    }

    private void printGameOver() {
        drawBoard();
        System.out.println("\uD83C\uDFAE Game Over! \uD83C\uDFAE");

        if (whoWonTheGame != null) {
            System.out.println(whoWonTheGame + " won the game, Congratulations! \uD83C\uDF8A \uD83C\uDF89");
        } else {
            System.out.println("It's a tie! Play again!");
        }
    }

    private boolean isBoardFull() {
        for (char[] row : gameBoard) {
            for (char cell : row) {
                if (cell == EMPTY_BOX) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean hasAnyPlayerWon() {
        char winner = ' ';

        // Check each row
        for (int i = 0; i < 3; i++) {
            if (gameBoard[i][0] == gameBoard[i][1] &&
                    gameBoard[i][1] == gameBoard[i][2] &&
                    gameBoard[i][0] != EMPTY_BOX) {
                winner = gameBoard[i][0];
            }
        }

        // Check each column
        for (int j = 0; j < 3; j++) {
            if (gameBoard[0][j] == gameBoard[1][j] &&
                    gameBoard[1][j] == gameBoard[2][j] &&
                    gameBoard[0][j] != EMPTY_BOX) {
                winner = gameBoard[0][j];
            }
        }

        // Check the diagonals
        if (gameBoard[0][0] == gameBoard[1][1] &&
                gameBoard[1][1] == gameBoard[2][2] &&
                gameBoard[0][0] != EMPTY_BOX) {
            winner = gameBoard[0][0];
        }

        if (gameBoard[2][0] == gameBoard[1][1] &&
                gameBoard[1][1] == gameBoard[0][2] &&
                gameBoard[2][0] != EMPTY_BOX) {
            winner = gameBoard[2][0];
        }

        if (winner == PLAYER_ONES_SYMBOL) {
            whoWonTheGame = playerOne;
        } else if (winner == PLAYER_TWOS_SYMBOL) {
            whoWonTheGame = playerTwo;
        }

        return whoWonTheGame != null;
    }

    private boolean validateInput(int row, int col) {
        if (row < 0 || col < 0 || row > 2 || col > 2) {
            System.out.println("The position is off the bounds of the board, try again.");
            return false;
        } else if (gameBoard[row][col] != EMPTY_BOX) {
            System.out.println("Someone has already made a move at this position, try again.");
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.startGame();
    }
}
