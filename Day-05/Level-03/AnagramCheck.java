import java.util.Scanner;

public class AnagramCheck {
    
    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // If the lengths are different, they cannot be anagrams
        if (text1.length() != text2.length()) {
            return false;
        }
        
        // Create arrays to store frequency of characters for both texts
        int[] freq1 = new int[256];  // Frequency array for text1 (assuming ASCII)
        int[] freq2 = new int[256];  // Frequency array for text2
        
        // Loop through both texts and count the frequency of each character
        for (int i = 0; i < text1.length(); i++) {
            freq1[text1.charAt(i)]++;
            freq2[text2.charAt(i)]++;
        }
        
        // Compare the frequency arrays for both texts
        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) {
                return false;  // If any character's frequency is different, return false
            }
        }
        
        return true;  // If all frequencies match, return true
    }

    public static void main(String[] args) {
        // Scanner for taking user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first text: ");
        String text1 = scanner.nextLine();
        
        System.out.print("Enter the second text: ");
        String text2 = scanner.nextLine();
        
        // Check if the texts are anagrams
        boolean result = areAnagrams(text1, text2);
        
        // Display the result
        if (result) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }
        
        scanner.close();
    }
}
