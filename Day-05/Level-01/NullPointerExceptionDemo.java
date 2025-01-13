import java.util.*;
public class NullPointerExceptionDemo {

    // Method to generate NullPointerException
    public static void generateException() {
        String text = null; // Initialize variable to null
        // This line will throw NullPointerException
        System.out.println("Length of text: " + text.length());
    }

    // Method to handle NullPointerException
    public static void handleException() {
        String text = null; // Initialize variable to null
        try {
            // Attempt to access a method on the null object
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Call method to generate the exception
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

        // Call method to handle the exception
        handleException();
    }
}
