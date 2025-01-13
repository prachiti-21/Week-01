import java.util.Scanner;

public class LeapYearChecker {

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        // Check for leap year conditions
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the year
        System.out.print("Enter a year (>= 1582): ");
        int year = scanner.nextInt();

        // Validate the year input
        if (year < 1582) {
            System.out.println("The year entered is not valid. Please enter a year >= 1582.");
            return;
        }

        // Check if the year is a leap year and display the result
        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }

        scanner.close();
    }
}
