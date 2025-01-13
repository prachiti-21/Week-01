import java.util.Scanner;

public class NumberFormat {

    // Method to generate NumberFormatException
    public static void generateException(String input) {
        // Attempt to parse an integer from the input string
        System.out.println("Parsed number: " + Integer.parseInt(input));
    }

    // Method to handle NumberFormatException
    public static void handleException(String input) {
        try {
            // Attempt to parse an integer from the input string
            System.out.println("Parsed number: " + Integer.parseInt(input));
        } catch (NumberFormatException e) {
            System.out.println("Caught a NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught a RuntimeException: " + e.getMessage());
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
        } catch (NumberFormatException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

        // Call method to handle the exception
        handleException(userInput);

        scanner.close();
    }
}
