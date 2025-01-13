import java.util.*;
class CheckNumber{
  public static void main(String args[]){
   Scanner input= new Scanner(System.in);
   int number;
   System.out.println("Enter a number: ");
   number= input.nextInt();
   
//check the number is positive, negative or 0
  if(number>0){
    System.out.println("Positive");
   }
  else if(number==0){
    System.out.println("Zero");
   }
  else if(number<0){
   System.out.println("Negative");
  }

 }

}