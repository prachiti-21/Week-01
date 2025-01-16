import java.util.Scanner;

public class NonRepeatingCharacter {

    // Method to find the first non-repeating character in a string using charAt()
    public static char findFirstNonRepeatingCharacter(String text) {
        int[] charFrequency = new int[256]; // Array to store frequency of ASCII characters

        // Calculate frequency of each character in the string
        for (int i = 0; i < text.length(); i++) {
            charFrequency[text.charAt(i)]++;
        }

        // Find the first character with frequency 1
        for (int i = 0; i < text.length(); i++) {
            if (charFrequency[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }

        return '\0'; // Return null character if no non-repeating character is found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string from the user
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Find the first non-repeating character
        char firstNonRepeating = findFirstNonRepeatingCharacter(text);

        // Display the result
        if (firstNonRepeating != '\0') {
            System.out.println("The first non-repeating character is: " + firstNonRepeating);
        } else {
            System.out.println("No non-repeating character found in the string.");
        }

        scanner.close();
    }
}
