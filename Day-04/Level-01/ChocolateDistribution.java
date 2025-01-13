import java.util.Scanner;

public class ChocolateDistribution {

    // Method to find the number of chocolates each child gets and the remainder
    public static int[] findRemainderAndQuotient(int numberOfChocolates, int numberOfChildren) {
        int[] result = new int[2]; // Array to store quotient (chocolates per child) and remainder
        
        // Calculate how many chocolates each child gets
        result[0] = numberOfChocolates / numberOfChildren; // Division for chocolates per child
        
        // Calculate remaining chocolates
        result[1] = numberOfChocolates % numberOfChildren; // Modulus for remaining chocolates
        
        return result; // Return the result array containing chocolates per child and remainder
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the number of chocolates and number of children
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();
        
        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();

        // Call the method to find chocolates per child and remainder
        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

        // Display the result
        System.out.println("Each child will get: " + result[0] + " chocolates.");
        System.out.println("Remaining chocolates: " + result[1]);
    }
}