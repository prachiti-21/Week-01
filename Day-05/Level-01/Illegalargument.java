import java.util.Scanner;

public class IllegalArgument {

    // Method to generate IllegalArgumentException
    public static void generateException(String input) {
        // Using substring with start index greater than end index
        System.out.println("Substring: " + input.substring(5, 2));
    }

    // Method to handle IllegalArgumentException
    public static void handleException(String input) {
        try {
            // Attempt to use substring with invalid indices
            System.out.println("Substring: " + input.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught an IllegalArgumentException: " + e.getMessage());
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
        } catch (IllegalArgumentException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

        // Call method to handle the exception
        handleException(userInput);

        scanner.close();
    }
}
