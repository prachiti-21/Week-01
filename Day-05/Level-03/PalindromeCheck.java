import java.util.Scanner;

public class PalindromeCheck {

    // Logic 1: Method to check palindrome by comparing characters from start and end
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;
        
        // Loop to compare characters from start and end
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive method to check palindrome by comparing characters
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        // Base case: If the start index is greater than or equal to the end index
        if (start >= end) {
            return true;
        }
        
        // If characters at start and end are not equal
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        
        // Recursive call with incremented start index and decremented end index
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Method to check palindrome using character arrays
    public static boolean isPalindromeUsingArrays(String text) {
        // Reverse the string and convert to character array
        char[] original = text.toCharArray();
        char[] reversed = new char[text.length()];
        
        for (int i = 0; i < text.length(); i++) {
            reversed[i] = text.charAt(text.length() - 1 - i);
        }
        
        // Compare original and reversed arrays
        for (int i = 0; i < text.length(); i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Scanner for taking user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Logic 1: Check palindrome using iterative method
        boolean result1 = isPalindromeIterative(input);
        System.out.println("Palindrome check using iterative method: " + result1);
        
        // Logic 2: Check palindrome using recursive method
        boolean result2 = isPalindromeRecursive(input, 0, input.length() - 1);
        System.out.println("Palindrome check using recursive method: " + result2);
        
        // Logic 3: Check palindrome using character arrays
        boolean result3 = isPalindromeUsingArrays(input);
        System.out.println("Palindrome check using character arrays: " + result3);
        
        scanner.close();
    }
}
