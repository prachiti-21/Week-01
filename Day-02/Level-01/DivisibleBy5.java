import java.util.*;
class DivisibleBy5{
public static void main(String args[]){
   Scanner input=new Scanner(System.in);
   int number;
   System.out.println("Enter a number:" );
   //input number
   number= input.nextInt();

   //checking divisibility by 5
   if(number%5==0){
     System.out.print("Is the number "+ number+" divisible by 5? "+"Yes!");
   }
   else{
     System.out.print("Is the number "+ number+" divisible by 5? "+"No!");

   }
   
}
}