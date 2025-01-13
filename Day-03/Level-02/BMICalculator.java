import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of persons
        System.out.print("Enter the number of persons: ");
        int numPersons = scanner.nextInt();

        // Arrays to store height, weight, BMI, and weight status
        double[] heights = new double[numPersons];
        double[] weights = new double[numPersons];
        double[] bmis = new double[numPersons];
        String[] weightStatus = new String[numPersons];

        // Input: Weight and Height of persons
        for (int i = 0; i < numPersons; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));

            System.out.print("Enter weight (in kg): ");
            weights[i] = scanner.nextDouble();

            System.out.print("Enter height (in meters): ");
            heights[i] = scanner.nextDouble();
            
            // Calculating BMI
            bmis[i] = weights[i] / (heights[i] * heights[i]);

            // Determine weight status based on BMI
            if (bmis[i] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmis[i] >= 18.5 && bmis[i] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmis[i] >= 25 && bmis[i] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display results
        System.out.println("\nPerson Details:");
        System.out.println("-----------------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s\n", "Person", "Height", "Weight", "BMI", "Status");

        for (int i = 0; i < numPersons; i++) {
            System.out.printf("%-10d %-10.2f %-10.2f %-10.2f %-10s\n", 
                (i + 1), heights[i], weights[i], bmis[i], weightStatus[i]);
        }

        scanner.close();
    }
}
