import java.util.Scanner;

public class CharacterFrequency3 {
    
    // Method to find the frequency of characters in a string using nested loops
    public static String[] findCharacterFrequency(String text) {
        char[] characters = text.toCharArray();  // Convert the string to a character array
        int length = characters.length;
        String[] result = new String[length];  // To store the result of characters and their frequencies
        
        // Loop through each character in the string (Outer Loop)
        for (int i = 0; i < length; i++) {
            // Skip already counted characters
            if (characters[i] == '0') {
                continue;
            }
            
            // Initialize the frequency of the character to 1
            int count = 1;
            
            // Loop to compare the current character with all subsequent characters (Inner Loop)
            for (int j = i + 1; j < length; j++) {
                if (characters[i] == characters[j]) {
                    count++;
                    characters[j] = '0';  // Mark the character as counted by setting it to '0'
                }
            }
            
            // Store the character and its frequency in the result array
            result[i] = characters[i] + " : " + count;
        }
        
        return result;
    }

    public static void main(String[] args) {
        // Scanner for taking user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Call the method to find character frequencies
        String[] frequencies = findCharacterFrequency(input);
        
        // Display the result
        System.out.println("Character Frequency:");
        for (String freq : frequencies) {
            if (freq != null) {
                System.out.println(freq);
            }
        }
        
        scanner.close();
    }
}
