import java.util.Scanner;

public class BMICalculator2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of persons
        System.out.print("Enter the number of persons: ");
        int numPersons = scanner.nextInt();

        // Multi-dimensional array to store weight, height, and BMI
        double[][] personData = new double[numPersons][3];  // 3 columns: [0] = weight, [1] = height, [2] = BMI
        String[] weightStatus = new String[numPersons];

        // Input: Weight and Height of persons
        for (int i = 0; i < numPersons; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));

            // Input for weight (ensure positive value)
            double weight;
            do {
                System.out.print("Enter weight (in kg): ");
                weight = scanner.nextDouble();
                if (weight <= 0) {
                    System.out.println("Weight should be a positive value. Please re-enter.");
                }
            } while (weight <= 0);
            personData[i][0] = weight;

            // Input for height (ensure positive value)
            double height;
            do {
                System.out.print("Enter height (in meters): ");
                height = scanner.nextDouble();
                if (height <= 0) {
                    System.out.println("Height should be a positive value. Please re-enter.");
                }
            } while (height <= 0);
            personData[i][1] = height;
            
            // Calculating BMI
            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            // Determine weight status based on BMI
            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
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
                (i + 1), personData[i][1], personData[i][0], personData[i][2], weightStatus[i]);
        }

        scanner.close();
    }
}
