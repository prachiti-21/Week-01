import java.util.Scanner;

public class StringIndexOutOfBounds {

    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String input) {
        // Accessing an index beyond the string length
        System.out.println("Character at index 100: " + input.charAt(100));
    }

    // Method to handle StringIndexOutOfBoundsException
    public static void handleException(String input) {
        try {
            // Attempt to access an index beyond the string length
            System.out.println("Character at index 100: " + input.charAt(100));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught a StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Call method to generate the exception
        try {
            generateException(userInput);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

        // Call method to handle the exception
        handleException(userInput);

        scanner.close();
    }
}
