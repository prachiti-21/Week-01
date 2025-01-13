import java.util.Scanner;

public class StringCharacterComparison {

    // Method to return characters in a string without using toCharArray()
    public static char[] getCharacters(String input) {
        char[] characters = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            characters[i] = input.charAt(i);
        }
        return characters;
    }

    // Method to compare two character arrays
    public static boolean compareCharArrays(char[] array1, char[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String userInput = scanner.next();

        // Getting characters using user-defined method
        char[] userDefinedChars = getCharacters(userInput);

        // Getting characters using built-in toCharArray() method
        char[] builtInChars = userInput.toCharArray();

        // Comparing the two arrays
        boolean areEqual = compareCharArrays(userDefinedChars, builtInChars);

        // Displaying the results
        System.out.println("Characters from user-defined method: ");
        for (char c : userDefinedChars) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.println("Characters from toCharArray() method: ");
        for (char c : builtInChars) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.println("Are the two character arrays equal? " + areEqual);

        scanner.close();
    }
}
