import java.util.Scanner;

public class TriangleParkRun {

    public static void main(String[] args) {
        // Calling the method to process and display the number of rounds
        processRounds();
    }

    // Method to process the rounds by calling the calculation method with necessary inputs
    public static void processRounds() {
        // Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Input sides of the triangle
        System.out.print("Enter the length of side 1: ");
        double side1 = input.nextDouble();

        System.out.print("Enter the length of side 2: ");
        double side2 = input.nextDouble();

        System.out.print("Enter the length of side 3: ");
        double side3 = input.nextDouble();

        // Calling the method to calculate the rounds by passing side1, side2, and side3 as arguments
        int rounds = calculateRounds(side1, side2, side3);

        // Displaying the result
        System.out.println("The athlete needs to complete " + rounds + " rounds to run 5 kilometers.");
    }

    // Method to calculate the number of rounds
    public static int calculateRounds(double side1, double side2, double side3) {
        // Calculating the perimeter of the triangle
        double perimeter = side1 + side2 + side3;

        // Converting 5 km to meters
        double targetDistance = 5000;

        // Calculating the number of rounds to cover 5 km
        return (int) Math.ceil(targetDistance / perimeter);
    }
}