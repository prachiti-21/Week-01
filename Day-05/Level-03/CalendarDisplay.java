import java.util.Scanner;

public class CalendarDisplay {

    // Method to get the name of the month
    public static String getMonthName(int month) {
        String[] months = {"January", "February", "March", "April", "May", "June",
                           "July", "August", "September", "October", "November", "December"};
        return months[month - 1];  // Return the month name based on the input month
    }

    // Method to get the number of days in the month
    public static int getDaysInMonth(int month, int year) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        // Check for leap year in February
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        
        return daysInMonth[month - 1];  // Return the number of days in the specified month
    }

    // Method to check if the year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get the first day of the month using the Gregorian calendar algorithm
    public static int getFirstDayOfMonth(int month, int year) {
        int y = year;
        int m = month;
        
        if (m < 3) {
            m += 12;
            y -= 1;
        }
        
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (1 + x + 31 * m0 / 12) % 7;
        
        return d0;  // Return the first day of the month (0=Sunday, 1=Monday, ..., 6=Saturday)
    }

    // Method to print the calendar for the given month and year
    public static void printCalendar(int month, int year) {
        // Get the number of days in the month
        int daysInMonth = getDaysInMonth(month, year);
        
        // Get the first day of the month
        int firstDay = getFirstDayOfMonth(month, year);
        
        // Print the header of the calendar
        System.out.println("       " + getMonthName(month) + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");
        
        // Print leading spaces for the first day of the month
        for (int i = 0; i < firstDay; i++) {
            System.out.print("   ");
        }
        
        // Print the days of the month
        int day = 1;
        for (int i = firstDay; i < 7; i++) {
            System.out.printf("%2d ", day++);
        }
        System.out.println();
        
        // Print the rest of the days
        for (int i = 0; i < (daysInMonth - 1) / 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.printf("%2d ", day++);
            }
            System.out.println();
        }
        
        // Print remaining days in the last row
        for (int i = 0; i < (daysInMonth - 1) % 7 + 1; i++) {
            System.out.printf("%2d ", day++);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Scanner for user input
        Scanner scanner = new Scanner(System.in);
        
        // Get month and year from user
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();
        
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();
        
        // Print the calendar
        printCalendar(month, year);
        
        scanner.close();
    }
}
