import java.util.Scanner;

public class BMI2D {

    // Method to calculate BMI and status for each person
    public static String[][] calculateBMI(double[][] data) {
        String[][] results = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100.0; // Convert cm to meters
            double bmi = weight / (heightInMeters * heightInMeters);

            results[i][0] = String.format("%.2f", data[i][0]); // Weight
            results[i][1] = String.format("%.2f", data[i][1]); // Height
            results[i][2] = String.format("%.2f", bmi); // BMI

            // Determine BMI status
            if (bmi < 18.5) {
                results[i][3] = "Underweight";
            } else if (bmi < 24.9) {
                results[i][3] = "Normal weight";
            } else if (bmi < 29.9) {
                results[i][3] = "Overweight";
            } else {
                results[i][3] = "Obese";
            }
        }

        return results;
    }

    // Method to display the BMI results in a tabular format
    public static void displayBMIResults(String[][] results) {
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Weight (kg)", "Height (cm)", "BMI", "Status");
        System.out.println("------------------------------------------------");

        for (String[] row : results) {
            System.out.printf("%-10s %-10s %-10s %-15s\n", row[0], row[1], row[2], row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] data = new double[10][2];

        // Input weight and height for 10 team members
        for (int i = 0; i < 10; i++) {
            System.out.printf("Enter weight (kg) for person %d: ", i + 1);
            data[i][0] = scanner.nextDouble();

            System.out.printf("Enter height (cm) for person %d: ", i + 1);
            data[i][1] = scanner.nextDouble();
        }

        // Calculate BMI and statuses
        String[][] results = calculateBMI(data);

        // Display results
        displayBMIResults(results);

        scanner.close();
    }
}
