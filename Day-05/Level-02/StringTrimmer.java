import java.util.Scanner;

public class StringTrimmer {

    // Method to find start and end indices of a string without leading and trailing spaces
    public static int[] findTrimIndices(String str) {
        int start = 0;
        int end = str.length() - 1;

        // Find the first non-space character
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        // Find the last non-space character
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create a substring using charAt method
    public static String createSubstring(String str, int start, int end) {
        String trimmedString = "";
        for (int i = start; i <= end; i++) {
            trimmedString += str.charAt(i); // Append character by character
        }
        return trimmedString;
    }

    // Method to compare two strings using charAt method
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Find trim indices
        int[] indices = findTrimIndices(input);
        int start = indices[0];
        int end = indices[1];

        // Create a trimmed string using custom method
        String trimmedCustom = createSubstring(input, start, end);

        // Use built-in trim method
        String trimmedBuiltIn = input.trim();

        // Compare the two trimmed strings
        boolean areEqual = compareStrings(trimmedCustom, trimmedBuiltIn);

        // Display the results
        System.out.println("Custom Trimmed String: '" + trimmedCustom + "'");
        System.out.println("Built-in Trimmed String: '" + trimmedBuiltIn + "'");
        System.out.println("Are both trimmed strings equal? " + areEqual);

        scanner.close();
    }
}
