import java.util.*;
public class NumberChecker4 {

    // Method to check if a number is a prime number
    public static boolean isPrime(int number) {
        if (number <= 1) return false; // Prime numbers are greater than 1
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Found a divisor, so not prime
            }
        }
        return true; // No divisors found, the number is prime
    }

    // Method to check if a number is a neon number
    public static boolean isNeonNumber(int number) {
        int square = number * number;
        int sumOfDigits = 0;
        
        // Sum the digits of the square of the number
        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }
        
        // Check if sum of digits equals the original number
        return sumOfDigits == number;
    }

    // Method to check if a number is a spy number
    public static boolean isSpyNumber(int number) {
        int sum = 0;
        int product = 1;
        
        // Calculate sum and product of digits
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }
        
        // Check if sum equals product
        return sum == product;
    }

    // Method to check if a number is an automorphic number
    public static boolean isAutomorphicNumber(int number) {
        int square = number * number;
        int temp = number;
        
        // Check if the square ends with the original number
        while (square > 0) {
            if (square % 10 != temp % 10) {
                return false; // The digits don't match
            }
            square /= 10;
            temp /= 10;
        }
        
        return true; // All digits matched
    }

    // Method to check if a number is a buzz number
    public static boolean isBuzzNumber(int number) {
        return number % 7 == 0 || number % 10 == 7; // Check if divisible by 7 or ends with 7
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number:");
        int number=scanner.nextInt();


        // Check if the number is prime
        boolean isPrime = isPrime(number);
        System.out.println("Is Prime: " + isPrime);

        // Check if the number is a neon number
        boolean isNeon = isNeonNumber(number);
        System.out.println("Is Neon Number: " + isNeon);

        // Check if the number is a spy number
        boolean isSpy = isSpyNumber(number);
        System.out.println("Is Spy Number: " + isSpy);

        // Check if the number is an automorphic number
        boolean isAutomorphic = isAutomorphicNumber(number);
        System.out.println("Is Automorphic Number: " + isAutomorphic);

        // Check if the number is a buzz number
        boolean isBuzz = isBuzzNumber(number);
        System.out.println("Is Buzz Number: " + isBuzz);
    }
}
