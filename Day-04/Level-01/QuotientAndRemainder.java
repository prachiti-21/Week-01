import java.util.Scanner;

public class QuotientAndRemainder {

    // Method to find the quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] result = new int[2]; // Array to store quotient and remainder
        
        // Calculate quotient
        result[0] = number / divisor; // Division operator for quotient
        
        // Calculate remainder
        result[1] = number % divisor; // Modulus operator for remainder
        
        return result; // Return the result array containing quotient and remainder
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for two numbers
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        
        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        // Call the method to find quotient and remainder
        int[] result = findRemainderAndQuotient(number, divisor);

        // Display the result
        System.out.println("Quotient: " + result[0]);
        System.out.println("Remainder: " + result[1]);
    }
}