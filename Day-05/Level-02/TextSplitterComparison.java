import java.util.Scanner;

public class TextSplitterComparison {

    // Method to find the length of a string without using length()
    public static int findLength(String str) {
        int length = 0;
        for (char c : str.toCharArray()) {
            length++;
        }
        return length;
    }

    // Method to split text into words without using split()
    public static String[] customSplit(String text) {
        int wordCount = 0;
        boolean inWord = false;

        // Count the number of words
        for (int i = 0; i < findLength(text); i++) {
            if (text.charAt(i) != ' ') {
                if (!inWord) {
                    wordCount++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }

        // Create an array to store word indexes
        int[] spaceIndexes = new int[wordCount + 1];
        int index = 0;

        // Find indexes of spaces
        for (int i = 0; i < findLength(text); i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }
        spaceIndexes[index] = findLength(text);

        // Extract words using indexes
        String[] words = new String[wordCount];
        int start = 0, wordIndex = 0;

        for (int i = 0; i <= findLength(text); i++) {
            if (i == findLength(text) || text.charAt(i) == ' ') {
                if (i > start) {
                    words[wordIndex++] = text.substring(start, i);
                }
                start = i + 1;
            }
        }

        return words;
    }

    // Method to compare two string arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.println("Enter a sentence:");
        String inputText = scanner.nextLine();

        // Use the custom split method
        String[] customSplitWords = customSplit(inputText);

        // Use the built-in split method
        String[] builtInSplitWords = inputText.split(" ");

        // Compare the results
        boolean areEqual = compareArrays(customSplitWords, builtInSplitWords);

        // Display results
        System.out.println("Custom Split Result:");
        for (String word : customSplitWords) {
            System.out.println(word);
        }

        System.out.println("\nBuilt-in Split Result:");
        for (String word : builtInSplitWords) {
            System.out.println(word);
        }

        System.out.println("\nComparison Result: " + (areEqual ? "The results are identical." : "The results are different."));

        scanner.close();
    }
}
