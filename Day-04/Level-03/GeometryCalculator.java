import java.util.Scanner;

public class GeometryCalculator {

    // Method to calculate the Euclidean distance between two points
    public static double calculateEuclideanDistance(double x1, double y1, double x2, double y2) {
        // Euclidean distance formula: sqrt((x2 - x1)^2 + (y2 - y1)^2)
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to calculate the equation of the line passing through two points
    public static double[] calculateLineEquation(double x1, double y1, double x2, double y2) {
        double[] equation = new double[2];

        // Calculate slope (m): m = (y2 - y1) / (x2 - x1)
        double m = (y2 - y1) / (x2 - x1);
        
        // Calculate y-intercept (b): b = y1 - m * x1
        double b = y1 - m * x1;

        // Store slope and y-intercept in the array
        equation[0] = m;
        equation[1] = b;
        
        return equation;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take inputs for the two points (x1, y1) and (x2, y2)
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();

        // Calculate the Euclidean distance
        double distance = calculateEuclideanDistance(x1, y1, x2, y2);
        System.out.println("Euclidean distance between the points: " + distance);

        // Calculate the equation of the line
        double[] lineEquation = calculateLineEquation(x1, y1, x2, y2);
        double slope = lineEquation[0];
        double yIntercept = lineEquation[1];

        // Display the equation of the line
        System.out.println("Equation of the line: y = " + slope + "x + " + yIntercept);
    }
}
