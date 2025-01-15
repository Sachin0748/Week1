import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GameOfCard {

    // Method to initialize the deck of cards
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        
        return deck;
    }

    // Method to shuffle the deck of cards
    public static void shuffleDeck(String[] deck) {
        Random rand = new Random();
        int n = deck.length;
        
        // Shuffle using Fisher-Yates algorithm
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + rand.nextInt(n - i);
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    // Method to distribute the deck of n cards to x number of players
    public static String[][] distributeCards(String[] deck, int numOfCards, int numOfPlayers) {
        if (numOfCards % numOfPlayers != 0) {
            System.out.println("The deck cannot be evenly distributed among the players.");
            return null;
        }
        
        int cardsPerPlayer = numOfCards / numOfPlayers;
        String[][] players = new String[numOfPlayers][cardsPerPlayer];
        
        int cardIndex = 0;
        for (int i = 0; i < numOfPlayers; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                players[i][j] = deck[cardIndex++];
            }
        }
        
        return players;
    }

    // Method to print the cards each player has
    public static void printPlayersCards(String[][] players) {
        if (players == null) {
            return;
        }
        
        int playerNumber = 1;
        for (String[] player : players) {
            System.out.println("Player " + playerNumber + "'s cards: " + Arrays.toString(player));
            playerNumber++;
        }
    }

    public static void main(String[] args) {
        // Scanner for taking user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask user for number of players
        System.out.print("Enter the number of players: ");
        int numOfPlayers = scanner.nextInt();
        
        // Initialize the deck
        String[] deck = initializeDeck();
        
        // Shuffle the deck
        shuffleDeck(deck);
        
        // Number of cards in the deck (52 cards)
        int numOfCards = 52;
        
        // Distribute the cards to players
        String[][] players = distributeCards(deck, numOfCards, numOfPlayers);
        
        // Print the players' cards
        printPlayersCards(players);
        
        // Close the scanner
        scanner.close();
    }
}
