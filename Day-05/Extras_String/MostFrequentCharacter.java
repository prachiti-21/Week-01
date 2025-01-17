public class MostFrequentCharacter {
    public static void main(String[] args) {
        // Example Input
        String input = "success";

        // Find and display the most frequent character
        char mostFrequentChar = findMostFrequentCharacter(input);
        System.out.println("Most Frequent Character: '" + mostFrequentChar + "'");
    }

    public static char findMostFrequentCharacter(String str) {
        // Initialize an array to store frequency of each character (assuming ASCII characters)
        int[] freq = new int[256];

        // Traverse the string and count the frequency of each character
        for (char ch : str.toCharArray()) {
            freq[ch]++;
        }

        // Find the character with the maximum frequency
        char mostFrequentChar = str.charAt(0);
        int maxCount = 0;
        for (char ch : str.toCharArray()) {
            if (freq[ch] > maxCount) {
                mostFrequentChar = ch;
                maxCount = freq[ch];
            }
        }

        return mostFrequentChar;
    }
}
