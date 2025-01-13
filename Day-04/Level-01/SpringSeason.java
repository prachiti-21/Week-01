import java.util.Scanner;

public class SpringSeason {

    // Method to check if the date is in Spring season (March 20 to June 20)
    public static boolean isSpringSeason(int month, int day) {
        // Spring season is from March 20 to June 20
        if (month > 3 && month < 6) {
            return true; // March, April, May are in Spring
        } else if (month == 3 && day >= 20) {
            return true; // March 20 or later is in Spring
        } else if (month == 6 && day <= 20) {
            return true; // June 20 or earlier is in Spring
        }
        return false; // Else, it's not Spring
    }

    public static void main(String[] args) {
        // Creating scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Taking input for month and day input
        System.out.print("Enter month (1-12): ");
        int month = input.nextInt();

        System.out.print("Enter day (1-31): ");
        int day = input.nextInt();

        // Check if the date is in Spring season and print the result
        if (isSpringSeason(month, day)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }

        // Close the scanner
        input.close();
    }
}