import java.util.*;

public class StudentVoteChecker {

    // Method to check if a student can vote based on their age
    public static boolean canStudentVote(int age) {
        // Validate age
        if (age < 0) {
            return false; // Invalid age
        }
        return age >= 18; // Return true if age is 18 or above, else false
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ages = new int[10]; // Array to store ages of 10 students

        // Loop to get age input for 10 students
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
        }

        // Check voting eligibility for each student
        for (int i = 0; i < ages.length; i++) {
            if (canStudentVote(ages[i])) {
                System.out.println("Student " + (i + 1) + " with age " + ages[i] + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " with age " + ages[i] + " cannot vote.");
            }
        }

        scanner.close();
    }
}
