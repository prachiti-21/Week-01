import java.util.*;
class Calculator{
 public static void main(String args[]){ 
    Scanner input = new Scanner(System.in);
    double first,second,result;
    char op;
    System.out.println("Enter 2 numbers: ");
    first= input.nextDouble();
    second= input.nextDouble();
    System.out.println("Enter operator:");
    op= input.next().charAt(0);
   
    //Switch case
    switch(op){
    case '+': 
         result= first + second;
         System.out.println("Sum: "+ result);
         break;
    case '-': 
         result=first - second;
         System.out.println("Subtraction: "+ result);
         break;
    case '*': 
         result=first * second;
         System.out.println("Multiplication: "+ result);
         break;
    case '/': 
         result=first/second;
         System.out.println("Division: "+ result);
         break;
    default:  
         System.out.println("Invalid operator");
         break;
    }
  }
}