import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Method to calculate the sum of n natural numbers
    public static int findSumOfNaturalNumbers(int n) {
        int sum = 0;
        // Loop from 1 to n to calculate the sum
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for n
        System.out.print("Enter a positive integer n: ");
        int n = scanner.nextInt();

        // Check if the input is a positive number
        if (n < 1) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Call the method to calculate sum and display the result
            int sum = findSumOfNaturalNumbers(n);
            System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        }
    }
}