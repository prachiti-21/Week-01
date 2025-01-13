import java.util.*;

public class RandomNumbers {

    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = rand.nextInt(9000) + 1000; // Generates a 4-digit number
        }
        return randomNumbers;
    }

    // Method to calculate the average, minimum, and maximum value of an array
    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];
        
        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        
        double average = sum / numbers.length;
        
        return new double[] {average, min, max};
    }

    public static void main(String[] args) {
        // Generate an array of 5 random 4-digit numbers
        int[] randomNumbers = generate4DigitRandomArray(5);
        
        // Display the generated random numbers
        System.out.println("Generated 4-digit random numbers:");
        for (int num : randomNumbers) {
            System.out.println(num);
        }
        
        // Find and display the average, min, and max values
        double[] result = findAverageMinMax(randomNumbers);
        System.out.println("\nAverage value: " + result[0]);
        System.out.println("Minimum value: " + result[1]);
        System.out.println("Maximum value: " + result[2]);
    }
}
