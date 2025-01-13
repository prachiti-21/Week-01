import java.util.Random;
import java.util.Scanner;

public class StudentScore {

    // Method to generate random scores for Physics, Chemistry, and Math for all students
    public static int[][] generateScores(int numStudents) {
        Random rand = new Random();
        int[][] scores = new int[numStudents][3]; // 2D array for Physics, Chemistry, and Math scores
        
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = rand.nextInt(90) + 10; // Random score between 10 and 99 for Physics
            scores[i][1] = rand.nextInt(90) + 10; // Random score between 10 and 99 for Chemistry
            scores[i][2] = rand.nextInt(90) + 10; // Random score between 10 and 99 for Math
        }
        
        return scores;
    }

    // Method to calculate the total, average, and percentage for each student
    public static double[][] calculateResults(int[][] scores, int numStudents) {
        double[][] results = new double[numStudents][4]; // 2D array for total, average, percentage, and individual subject scores
        
        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2]; // Sum of the scores
            double average = total / 3.0; // Average of the scores
            double percentage = (total / 300.0) * 100; // Percentage calculation
            
            // Round off the values to 2 decimal places
            results[i][0] = Math.round(total * 100.0) / 100.0;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
            
            // Store individual subject scores
            results[i][3] = total; // Use this column to display the total (for clarity in output)
        }
        
        return results;
    }

    // Method to display the scorecard in a tabular format
    public static void displayScorecard(int[][] scores, double[][] results, int numStudents) {
        System.out.println("---------------------------------------------------------------");
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage");
        System.out.println("---------------------------------------------------------------");
        
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%d\t%d\t\t%d\t\t%d\t%.2f\t%.2f\t%.2f\n", 
                    i + 1, 
                    scores[i][0], 
                    scores[i][1], 
                    scores[i][2], 
                    results[i][0], 
                    results[i][1], 
                    results[i][2]);
        }
        System.out.println("---------------------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking the number of students as input
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        
        // Generate scores for students
        int[][] scores = generateScores(numStudents);
        
        // Calculate total, average, and percentage
        double[][] results = calculateResults(scores, numStudents);
        
        // Display the scorecard
        displayScorecard(scores, results, numStudents);
        
        scanner.close();
    }
}
