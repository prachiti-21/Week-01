import java.util.*;
class Armstrong{
 public static void main(String args[]){ 
    Scanner input = new Scanner(System.in);
    int number;
    System.out.println("Enter  number :" );
    number= input.nextInt();

   //initializing sum variable to 0
    int sum=0;

   //initializing priginalNumber to number
    int originalNumber=number;

    //iterating while loop
    while(originalNumber>0){
     int remainder= originalNumber%10;
     int cube= remainder*remainder*remainder;
     sum+=cube;
     originalNumber=originalNumber/10;
    }
    //checking if sum and number are same
     if(sum==number){
      System.out.println(number+" is an Armstrong number");
     }
     else{
      System.out.println(number+" is not an Armstrong number");

     }
  }
}