import java.util.*;
class SimpleInterest{
//creating return type function  to calculate simple interest
 public double calculateSI(double principle,double rate,double time){
   double simple_interest= (principle*rate*time)/100;
   return simple_interest;
    }
 public static void main(String args[]){
      Scanner input=new Scanner(System.in);

      //creating object for SimpleInterest class
      SimpleInterest obj= new SimpleInterest();

      double principle,rate,time;

      //taking inputs
      System.out.println("Enter principle amount:");
      principle= input.nextDouble();
      System.out.println("Enter rate of interest:");
      rate= input.nextDouble();
      System.out.println("Enter time:");
      time= input.nextDouble();

      //calling calculateSI() function and storing it in si variable
      double si= obj.calculateSI(principle,rate,time);
   
      //display
       System.out.println("The simple Interest is "+si+" for principle "+principle+" rate of interest "+rate+" and Time "+time);

      
   }
}