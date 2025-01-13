import java.util.*;
class Power{
 public static void main(String args[]){ 
    Scanner input = new Scanner(System.in);
    double number,power;
    System.out.println("Enter  number and its power:" );
    number= input.nextDouble();
    power= input.nextDouble();

    //intitializing result to 1
    double result=1;
    
    //iterating to find power 
    for(int i=1;i<=power;i++){
       result*=number;
     }
   System.out.println("The power of "+number +" is "+result );
 }
}