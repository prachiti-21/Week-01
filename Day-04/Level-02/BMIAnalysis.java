import java.util.*;

public class BMIAnalysis {

    // Method to calculate BMI
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double heightInMeters = data[i][1] / 100; // Convert height from cm to meters
            data[i][2] = data[i][0] / (heightInMeters * heightInMeters); // Calculate BMI
        }
    }

    // Method to determine BMI status
    public static String[] determineBMIStatus(double[][] data) {
        String[] statuses = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi < 18.5) {
                statuses[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                statuses[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }
        return statuses;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][3]; // 2D array: [weight, height, BMI]

        // Input weight and height for 10 members
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble();
            System.out.print("Enter height (in cm) for person " + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble();
        }

        // Calculate BMI for each person
        calculateBMI(data);

        // Determine BMI status for each person
        String[] statuses = determineBMIStatus(data);

        // Display results
        System.out.println("\nHeight, Weight, BMI, and Status of Each Individual:");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("Person %d: Height = %.2f cm, Weight = %.2f kg, BMI = %.2f, Status = %s\n",
                    i + 1, data[i][1], data[i][0], data[i][2], statuses[i]);
        }

        scanner.close();
    }
}
