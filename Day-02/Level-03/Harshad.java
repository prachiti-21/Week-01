import java.util.*;
class Harshad{
 public static void main(String args[]){ 
    Scanner input = new Scanner(System.in);
    int number,origin;
    int sum=0;
    
    System.out.println("Enter  number :" );
    number= input.nextInt();
    origin=number;
    
    //seperating digits
    while(origin!=0){
    int remainder=origin%10;
    sum+=remainder;
    origin=origin/10;
    
    }
    //check divisibility of number by sum
     if(number%sum==0){
     System.out.println("Its a harshad number");
     }
     else{ 
     System.out.println("Its not a Harshad number");
     }
  }
}