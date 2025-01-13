import java.util.Scanner;

public class NumberSignChecker {

    public static void main(String[] args) {
        // Calling the method to process and display the number sign
        checkNumberSign();
    }

    // Method to check whether a number is positive, negative, or zero
    public static void checkNumberSign() {
        // Creating Scanner object for input
        Scanner input = new Scanner(System.in);

        // Taking integer input from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Calling the method to determine the sign and get the result
        int result = determineNumberSign(number);

        // Displaying the result
        if (result == 1) {
            System.out.println("The number is positive.");
        } else if (result == -1) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }

    // Method to return -1 for negative number, 1 for positive number, and 0 for zero
    public static int determineNumberSign(int number) {
        if (number > 0) {
            return 1; // Positive number
        } else if (number < 0) {
            return -1; // Negative number
        } else {
            return 0; // Zero
        }
    }
}