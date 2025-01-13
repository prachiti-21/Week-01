import java.util.*;

public class NumberChecker5 {

    // Method to find the factors of a number and return them as an array
    public static int[] findFactors(int number) {
        ArrayList<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= number / 2; i++) {  // Loop through to find factors
            if (number % i == 0) {
                factors.add(i);
            }
        }
        int[] factorsArray = new int[factors.size()];
        for (int i = 0; i < factors.size(); i++) {
            factorsArray[i] = factors.get(i);
        }
        return factorsArray;
    }

    // Method to find the greatest factor of a number using the factors array
    public static int greatestFactor(int number) {
        int[] factors = findFactors(number);
        int greatest = 0;
        for (int factor : factors) {
            if (factor > greatest) {
                greatest = factor;
            }
        }
        return greatest;
    }

    // Method to find the sum of the factors using the factors array
    public static int sumOfFactors(int number) {
        int[] factors = findFactors(number);
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors using the factors array
    public static int productOfFactors(int number) {
        int[] factors = findFactors(number);
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of the cubes of the factors using the factors array
    public static double productOfCubesOfFactors(int number) {
        int[] factors = findFactors(number);
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        int sum = sumOfFactors(number);
        return sum == number;
    }

    // Method to check if a number is an abundant number
    public static boolean isAbundantNumber(int number) {
        int sum = sumOfFactors(number);
        return sum > number;
    }

    // Method to check if a number is a deficient number
    public static boolean isDeficientNumber(int number) {
        int sum = sumOfFactors(number);
        return sum < number;
    }

    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int number) {
        int temp = number;
        int sumFactorial = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sumFactorial += factorial(digit);
            temp /= 10;
        }
        return sumFactorial == number;
    }

    // Helper method to calculate factorial of a number
    private static int factorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number:");
        int number=scanner.nextInt();


        // Find factors of the number
        int[] factors = findFactors(number);
        System.out.println("Factors: " + Arrays.toString(factors));

        // Find the greatest factor of the number
        int greatest = greatestFactor(number);
        System.out.println("Greatest Factor: " + greatest);

        // Find the sum of the factors
        int sumFactors = sumOfFactors(number);
        System.out.println("Sum of Factors: " + sumFactors);

        // Find the product of the factors
        int productFactors = productOfFactors(number);
        System.out.println("Product of Factors: " + productFactors);

        // Find the product of the cubes of the factors
        double productOfCubes = productOfCubesOfFactors(number);
        System.out.println("Product of Cubes of Factors: " + productOfCubes);

        // Check if the number is a perfect number
        boolean isPerfect = isPerfectNumber(number);
        System.out.println("Is Perfect Number: " + isPerfect);

        // Check if the number is an abundant number
        boolean isAbundant = isAbundantNumber(number);
        System.out.println("Is Abundant Number: " + isAbundant);

        // Check if the number is a deficient number
        boolean isDeficient = isDeficientNumber(number);
        System.out.println("Is Deficient Number: " + isDeficient);

        // Check if the number is a strong number
        boolean isStrong = isStrongNumber(number);
        System.out.println("Is Strong Number: " + isStrong);
    }
}
