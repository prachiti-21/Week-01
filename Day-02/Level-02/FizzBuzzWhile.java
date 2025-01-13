import java.util.*;

class FizzBuzzWhile{
 public static void main(String args[]){ 
    Scanner input = new Scanner(System.in);
    int number;
    System.out.println("Enter number:");
    number= input.nextInt();
   //check if number is positive
    if(number>0){
      int i=0;
      while(i<=number){

        //divisible by 3
        if(i%3==0){
          System.out.println("Fizz");
         }

        //divisible by 5
        else if(i%5==0){
          System.out.println("Buzz");
        }
    
        //divisible by 3 and 5
        else if(i%3==0 &&  i%5==0){
          System.out.println("FizzBuzz");
         }
        else{
          System.out.println(i);
        }
        i++;
     }
    }
 }
}