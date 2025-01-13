import java.util.Scanner;

public class DigitFrequency {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Take the number from the user
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        // Handle negative numbers by taking the absolute value
        number = Math.abs(number);

        // Frequency array to store the count of each digit (0-9)
        int[] frequency = new int[10];

        // Process the number and calculate the frequency of each digit
        while (number > 0) {
            int digit = (int) (number % 10);  
            frequency[digit]++;              
            number /= 10;                    
        }

        // Display the frequency of each digit
        System.out.println("Digit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }

        scanner.close();
    }
}