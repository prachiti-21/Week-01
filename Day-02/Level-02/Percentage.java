import java.util.Scanner;

public class Percentage
{
	public static void main(String[] args)
	{
		//Initializing variable
		double marks_physics,marks_chemistry,marks_maths;
                 

		//Creating scanner object
		Scanner input = new Scanner(System.in);
                System.out.println("Enter marks of physics,chemistry and maths:");
                marks_physics= input.nextDouble();
                marks_chemistry= input.nextDouble();
                marks_maths= input.nextDouble();
               
               //calculating total marks
               double total = marks_physics +  marks_chemistry +  marks_maths;

               //average marks
               double average_marks= (marks_physics +  marks_chemistry +  marks_maths)/3;
               //calculate percentage
               double percent= (total/300)*100;
               
               //display
               if(percent>=80){
                  System.out.println(average_marks+" Grade: A, Level 4, above agency-normalized standards");
            
                }
               if(percent>=70 && percent<=79){
                  System.out.println(average_marks+" Grade: B, Level 3, at agency -normalized standards");
                }
               if(percent>=60 && percent<=69){
               System.out.println(average_marks+" Grade: C, level 2, below, but approaching agency-normalized standards" );
               }
               if(percent>=50 && percent <=59){
                System.out.println(average_marks+" Grade: D, level 1,well below agency-normalized standards");
                 }
               if(percent>=40 && percent<=49){
                 System.out.println(average_marks+" Grade: E, level 1-, too below agency-normalized standards");
                 }
               if(percent<40){
                System.out.println(average_marks+" Grade: R,Remedial standards");
                }
}
}
                        
              
              
