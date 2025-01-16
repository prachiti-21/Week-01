import java.util.Arrays;
import java.util.Random;

public class CardGame {

    // Method to initialize the deck of cards
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        
        int index = 0;
        // Populate the deck with all combinations of suits and ranks
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    // Method to shuffle the deck of cards
    public static String[] shuffleDeck(String[] deck) {
        Random rand = new Random();
        for (int i = 0; i < deck.length; i++) {
            // Generate a random card index to swap with
            int randomCardNumber = i + rand.nextInt(deck.length - i);
            // Swap the current card with the random card
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }

    // Method to distribute the cards to the players
    public static String[][] distributeCards(String[] deck, int numOfCards, int numOfPlayers) {
        if (numOfCards % numOfPlayers != 0) {
            System.out.println("The cards cannot be evenly distributed.");
            return null;
        }

        String[][] players = new String[numOfPlayers][numOfCards / numOfPlayers];
        
        int cardIndex = 0;
        // Distribute cards to players
        for (int i = 0; i < numOfPlayers; i++) {
            for (int j = 0; j < numOfCards / numOfPlayers; j++) {
                players[i][j] = deck[cardIndex++];
            }
        }
        return players;
    }

    // Method to print the players and their cards
    public static void printPlayersCards(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + ": " + Arrays.toString(players[i]));
        }
    }

    public static void main(String[] args) {
        // Initialize the deck of cards
        String[] deck = initializeDeck();
        
        // Shuffle the deck
        deck = shuffleDeck(deck);

        // Number of cards and players (adjust as needed)
        int numOfCards = 52; // A standard deck has 52 cards
        int numOfPlayers = 4; // Number of players

        // Distribute the deck of cards to the players
        String[][] players = distributeCards(deck, numOfCards, numOfPlayers);

        // If distribution is possible, print the players' cards
        if (players != null) {
            printPlayersCards(players);
        }
    }
}
