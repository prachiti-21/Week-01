import java.util.*;
class SumOfNaturalNos{
  public static void main(String args[]){
   Scanner input= new Scanner(System.in);
   int n;
   System.out.println("Enter the number till which the sum is to be calculated:");
   n= input.nextInt();
   
   //initializing sum variable to 0;
   int sum;

   //checking number is +ve or -ve
   if(n>0){
     //finding sum
      sum= n * (n+1)/2;
      System.out.println("The sum of "+n+" natural numbers is " + sum);
  }
  
   else{
      System.out.println("The number "+n +" is not a natural number");
  }

 }

}
    
