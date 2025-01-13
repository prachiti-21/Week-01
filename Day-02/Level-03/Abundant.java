import java.util.*;
class Abundant{
 public static void main(String args[]){ 
    Scanner input = new Scanner(System.in);
    int number;
    int sum=0;
    
    System.out.println("Enter  number :" );
    number= input.nextInt();
    
    
    //iterating through while loop
    int i=1;
    while(i<number){
     if(number%i==0){
      sum+=i;
     }
     i++;
    }
    //check if sum is greater than number
    if(sum>number){
      System.out.println(number+ " is an abundant number");
    }
    else{
      System.out.println(number+ " is not abundant number");

    }
  }
}