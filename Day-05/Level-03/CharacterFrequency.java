import java.util.Scanner;

public class CharacterFrequency {

    // Method to find the frequency of characters in a string using charAt()
    public static String[][] findCharacterFrequencies(String text) {
        int[] charFrequency = new int[256]; // Array to store frequency of ASCII characters

        // Calculate frequency of each character in the string
        for (int i = 0; i < text.length(); i++) {
            charFrequency[text.charAt(i)]++;
        }

        // Determine the number of unique characters
        int uniqueCount = 0;
        for (int freq : charFrequency) {
            if (freq > 0) {
                uniqueCount++;
            }
        }

        // Create a 2D array to store characters and their frequencies
        String[][] result = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < charFrequency.length; i++) {
            if (charFrequency[i] > 0) {
                result[index][0] = Character.toString((char) i); // Character
                result[index][1] = Integer.toString(charFrequency[i]); // Frequency
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string from the user
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Find the character frequencies
        String[][] frequencies = findCharacterFrequencies(text);

        // Display the result
        System.out.printf("%-10s %-10s\n", "Character", "Frequency");
        System.out.println("--------------------");
        for (String[] row : frequencies) {
            System.out.printf("%-10s %-10s\n", row[0], row[1]);
        }

        scanner.close();
    }
}
