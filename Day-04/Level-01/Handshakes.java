import java.util.Scanner;

public class Handshakes {

	public static void main(String[] args) {
		// Creating scanner object
		Scanner input = new Scanner(System.in);

		// Taking input number of students
		System.out.print("Enter the number of students: ");
		int n = input.nextInt();

		// Calling method to calculate maximum number of handshakes
		int handshakes = calculateHandshakes(n);

		// Output of the result
		System.out.println("The maximum number of handshakes among " + n + " students is: " + handshakes);
	}

	// Method to calculate the maximum number of handshakes
	public static int calculateHandshakes(int n) {
		// Formula for combinations		
            return (n * (n - 1)) / 2;
	}
}