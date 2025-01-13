import java.util.*;

public class FootballTeam {

    // Method to generate an array of random heights for players in cms
    public static int[] generateRandomHeights(int size) {
        int[] heights = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            heights[i] = rand.nextInt(101) + 150; // Generates heights in the range 150 to 250 cms
        }
        return heights;
    }

    // Method to find the sum of all elements in the array
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // Method to find the mean height of the players
    public static double findMeanHeight(int[] heights) {
        int sum = findSum(heights);
        return sum / (double) heights.length;
    }

    // Method to find the shortest height
    public static int findShortestHeight(int[] heights) {
        int min = heights[0];
        for (int height : heights) {
            if (height < min) {
                min = height;
            }
        }
        return min;
    }

    // Method to find the tallest height
    public static int findTallestHeight(int[] heights) {
        int max = heights[0];
        for (int height : heights) {
            if (height > max) {
                max = height;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        // Generate an array of 11 random heights for the football players
        int[] heights = generateRandomHeights(11);
        
        // Display the heights of the players
        System.out.println("Player Heights (in cms):");
        for (int height : heights) {
            System.out.println(height);
        }
        
        // Find and display the sum, mean, shortest, and tallest heights
        int sum = findSum(heights);
        double mean = findMeanHeight(heights);
        int shortest = findShortestHeight(heights);
        int tallest = findTallestHeight(heights);
        
        System.out.println("\nResults:");
        System.out.println("Sum of Heights: " + sum + " cms");
        System.out.println("Mean Height: " + mean + " cms");
        System.out.println("Shortest Height: " + shortest + " cms");
        System.out.println("Tallest Height: " + tallest + " cms");
    }
}
