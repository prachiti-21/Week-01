import java.util.Scanner;
import java.util.Random;

public class StudentVote {

    // Method to generate random 2-digit ages for n students
    public static int[] generateAges(int n) {
        Random random = new Random();
        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            ages[i] = random.nextInt(90) + 10; // Generate random age between 10 and 99
        }

        return ages;
    }

    // Method to check voting eligibility and return 2D array
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] eligibility = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            eligibility[i][0] = String.valueOf(ages[i]);

            if (ages[i] < 0) {
                eligibility[i][1] = "Cannot Vote"; // Negative ages are invalid
            } else if (ages[i] >= 18) {
                eligibility[i][1] = "Can Vote"; // Age 18 or above can vote
            } else {
                eligibility[i][1] = "Cannot Vote"; // Below 18 cannot vote
            }
        }

        return eligibility;
    }

    // Method to display the 2D array in tabular format
    public static void displayTable(String[][] table) {
        System.out.printf("%-10s %-15s\n", "Age", "Voting Eligibility");
        System.out.println("-------------------------");

        for (String[] row : table) {
            System.out.printf("%-10s %-15s\n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Generate random ages for students
        int[] ages = generateAges(numStudents);

        // Check voting eligibility
        String[][] eligibilityTable = checkVotingEligibility(ages);

        // Display the results in a tabular format
        displayTable(eligibilityTable);

        scanner.close();
    }
}
