import java.util.Scanner;

public class VowelConsonantCounter2D {

    // Method to check if a character is a vowel, consonant, or not a letter
    public static String checkCharacter(char ch) {
        ch = Character.toLowerCase(ch); // Convert to lowercase
        if (ch >= 'a' && ch <= 'z') { // Check if it's a letter
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    // Method to find vowels and consonants in a string and return a 2D array
    public static String[][] analyzeString(String str) {
        String[][] resultArray = new String[str.length()][2];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String type = checkCharacter(ch);
            resultArray[i][0] = String.valueOf(ch);
            resultArray[i][1] = type;
        }

        return resultArray;
    }

    // Method to display a 2D array in tabular format
    public static void displayResult(String[][] array) {
        System.out.printf("%-10s %-15s\n", "Character", "Type");
        System.out.println("--------------------------");
        for (String[] row : array) {
            System.out.printf("%-10s %-15s\n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Analyze the string
        String[][] analysisResult = analyzeString(input);

        // Display the result
        displayResult(analysisResult);

        scanner.close();
    }
}
