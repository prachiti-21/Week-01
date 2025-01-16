import java.util.Scanner;

public class LongAndShortest {

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
        String[] words = new String[findLength(text)];
        int count = 0;
        String temp = "";

        for (int i = 0; i < findLength(text); i++) {
            if (text.charAt(i) == ' ' || i == findLength(text) - 1) {
                if (i == findLength(text) - 1 && text.charAt(i) != ' ') {
                    temp += text.charAt(i);
                }
                if (!temp.isEmpty()) {
                    words[count++] = temp;
                    temp = "";
                }
            } else {
                temp += text.charAt(i);
            }
        }

        String[] result = new String[count];
        System.arraycopy(words, 0, result, 0, count);
        return result;
    }

    // Method to pair words with their lengths
    public static String[][] wordsWithLengths(String[] words) {
        String[][] wordLengths = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordLengths[i][0] = words[i];
            wordLengths[i][1] = String.valueOf(findLength(words[i]));
        }
        return wordLengths;
    }

    // Method to find the shortest and longest strings
    public static String[] findShortestAndLongest(String[][] wordLengths) {
        String shortest = wordLengths[0][0];
        String longest = wordLengths[0][0];

        for (String[] word : wordLengths) {
            if (findLength(word[0]) < findLength(shortest)) {
                shortest = word[0];
            }
            if (findLength(word[0]) > findLength(longest)) {
                longest = word[0];
            }
        }

        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();

        String[] words = customSplit(input);
        String[][] result = wordsWithLengths(words);

        System.out.println("Word     | Length");
        System.out.println("-------------------");
        for (String[] word : result) {
            System.out.printf("%-8s | %-6s%n", word[0], word[1]);
        }

        String[] shortestAndLongest = findShortestAndLongest(result);
        System.out.println("\nShortest word: " + shortestAndLongest[0]);
        System.out.println("Longest word: " + shortestAndLongest[1]);

        scanner.close();
    }
}
