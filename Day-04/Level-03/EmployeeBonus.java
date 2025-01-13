import java.util.Random;

public class EmployeeBonus {

    // Method to generate salary and years of service for 10 employees
    public static int[][] generateEmployeeData() {
        Random rand = new Random();
        int[][] employeeData = new int[10][2]; // 2D array for salary and years of service
        
        for (int i = 0; i < 10; i++) {
            // Generating random salary (5-digit)
            employeeData[i][0] = rand.nextInt(90000) + 10000; // Random salary between 10000 and 99999
            // Generating random years of service (between 1 and 20 years)
            employeeData[i][1] = rand.nextInt(20) + 1; // Random years of service between 1 and 20
        }
        
        return employeeData;
    }

    // Method to calculate new salary and bonus based on years of service
    public static double[][] calculateBonusAndNewSalary(int[][] employeeData) {
        double[][] updatedData = new double[10][3]; // 2D array for old salary, bonus, and new salary
        
        for (int i = 0; i < 10; i++) {
            int salary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];
            double bonus = 0;
            double newSalary = salary;
            
            // Bonus calculation based on years of service
            if (yearsOfService > 5) {
                bonus = salary * 0.05; // 5% bonus
            } else {
                bonus = salary * 0.02; // 2% bonus
            }
            
            newSalary = salary + bonus;
            
            // Store old salary, bonus, and new salary in the array
            updatedData[i][0] = salary;
            updatedData[i][1] = bonus;
            updatedData[i][2] = newSalary;
        }
        
        return updatedData;
    }

    // Method to calculate the total sum of old salaries, new salaries, and total bonuses
    public static void calculateSums(double[][] updatedData) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;
        
        for (int i = 0; i < 10; i++) {
            totalOldSalary += updatedData[i][0];
            totalBonus += updatedData[i][1];
            totalNewSalary += updatedData[i][2];
        }
        
        // Displaying the results in a tabular format
        System.out.println("----------------------------------------------------");
        System.out.println("Old Salary | Bonus | New Salary");
        System.out.println("----------------------------------------------------");
        
        for (int i = 0; i < 10; i++) {
            System.out.printf("%10.2f | %6.2f | %10.2f\n", updatedData[i][0], updatedData[i][1], updatedData[i][2]);
        }
        
        System.out.println("----------------------------------------------------");
        System.out.printf("Total Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total Bonus: %.2f\n", totalBonus);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);
        System.out.println("----------------------------------------------------");
    }

    public static void main(String[] args) {
        // Generate employee data (salary and years of service)
        int[][] employeeData = generateEmployeeData();
        
        // Calculate the bonus and new salary
        double[][] updatedData = calculateBonusAndNewSalary(employeeData);
        
        // Calculate and display the totals
        calculateSums(updatedData);
    }
}
