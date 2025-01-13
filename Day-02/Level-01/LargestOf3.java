import java.util.*;
class LargestOf3{
  public static void main(String args[]){
   Scanner input= new Scanner(System.in);
    int number1, number2, number3;
    System.out.println("Enter 3 numbers:");
    number1= input.nextInt();
    number2= input.nextInt();
    number3= input.nextInt();
   
   //checking which number is the largest of all 3 numbers
    boolean isLargest1= (number1 > number2) && (number1 > number3);
    boolean isLargest2= (number2 > number1) && (number2 > number3);
    boolean isLargest3= (number3>number1) && (number3 > number2);
    System.out.println("Is the first number the largest?"+(isLargest1?"Yes":"No"));
    System.out.println("Is the second number the largest?"+(isLargest2?"Yes":"No"));
    System.out.println("Is the third number the largest?"+(isLargest3?"Yes":"No"));
    

   }
 
 }

