import java.util.Scanner;

public class SmallestAndLargest {

    // Method to find the smallest and largest of three numbers
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int[] result = new int[2]; // Array to store the smallest and largest numbers
        
        // Find the smallest number
        result[0] = Math.min(number1, Math.min(number2, number3)); 
        
        // Find the largest number
        result[1] = Math.max(number1, Math.max(number2, number3)); 
        
        return result; // Return the result array containing the smallest and largest values
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for three numbers
        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int number2 = scanner.nextInt();
        
        System.out.print("Enter third number: ");
        int number3 = scanner.nextInt();

        // Call the method to find smallest and largest
        int[] result = findSmallestAndLargest(number1, number2, number3);

        // Display the result
        System.out.println("Smallest number: " + result[0]);
        System.out.println("Largest number: " + result[1]);
    }
}