import java.util.Scanner;

public class CharacterFrequency2 {
    
    // Method to find unique characters in a string
    public static char[] uniqueCharacters(String text) {
        boolean[] charExists = new boolean[256];  // Array to track if a character is already found
        int uniqueCount = 0;
        
        // First pass to count unique characters
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (!charExists[ch]) {
                charExists[ch] = true;
                uniqueCount++;
            }
        }
        
        // Create array to store unique characters
        char[] uniqueChars = new char[uniqueCount];
        int index = 0;
        
        // Second pass to store unique characters
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (charExists[ch]) {
                uniqueChars[index++] = ch;
                charExists[ch] = false;  // Prevent duplicates
            }
        }
        
        return uniqueChars;
    }
    
    // Method to find the frequency of characters in a string
    public static String[][] findCharacterFrequency(String text) {
        int[] freq = new int[256];  // Array to store the frequency of each character (ASCII)
        
        // Loop to count frequencies
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }
        
        // Get unique characters
        char[] uniqueChars = uniqueCharacters(text);
        
        // Create a 2D array to store character and their frequencies
        String[][] result = new String[uniqueChars.length][2];
        
        // Store characters and their frequencies in result array
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(freq[uniqueChars[i]]);
        }
        
        return result;
    }

    public static void main(String[] args) {
        // Scanner for taking user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Call the method to find character frequencies
        String[][] frequencies = findCharacterFrequency(input);
        
        // Display the result
        System.out.println("Character Frequency:");
        for (int i = 0; i < frequencies.length; i++) {
            System.out.println(frequencies[i][0] + " : " + frequencies[i][1]);
        }
        
        scanner.close();
    }
}
