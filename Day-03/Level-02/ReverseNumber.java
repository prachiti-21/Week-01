import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Find the count of digits in the number
        int tempNumber = number;
        int digitCount = 0;
        while (tempNumber != 0) {
            tempNumber /= 10;
            digitCount++;
        }

        // Create an array to store the digits
        int[] digits = new int[digitCount];

        // Extract digits and store them in the array
        int index = 0;
        while (number != 0) {
            digits[index] = number % 10; // Get the last digit
            number /= 10; // Remove the last digit
            index++;
        }

        // Display the digits in reverse order
        System.out.print("Reversed number: ");
        for (int i = 0; i < digitCount; i++) {
            System.out.print(digits[i]);
        }
        System.out.println();

        scanner.close();
    }
}
