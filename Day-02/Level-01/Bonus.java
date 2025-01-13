import java.util.*;
class Bonus{
  public static void main(String args[]){
   Scanner input= new Scanner(System.in);
   double salary,years;
   System.out.println("Enter salary and years of service ");
   salary= input.nextDouble();
   years= input.nextDouble();
   
   //checking for bonus
    double bonus=0.0;
    if(years>5){
     bonus= (double)(5* (salary/100);
    }
    
    System.out.println("Bonus amount is: " +bonus);
 }
}