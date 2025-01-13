import java.util.Scanner;

public class LeapYear
{
	public static void main(String[] args)
	{
		//Initializing variable
		int year;

		//Creating scanner object
		Scanner input = new Scanner(System.in);

		//Taking year as input
		System.out.print("Enter year: ");
		year = input.nextInt();

		//Checking if year is leap year or not
		if (year >= 1582 && (year % 4) == 0)
		{
			if (year % 100 == 0)
			{
				if (year % 400 == 0)
				{
					System.out.print("The year " + year + " is a leap year");
				}
				else
				{
					System.out.print("The year " + year + " is not a leap year");
				}
			}
			else
			{
				System.out.print("The year " + year + " is a leap year");
			}
		}
		else
		{
			System.out.print("The year " + year + " is not a leap year");
		}
	}
}