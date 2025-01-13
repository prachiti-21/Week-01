import java.util.*;
class Factor{
 public static void main(String args[]){ 
    Scanner input = new Scanner(System.in);
    double number;
    System.out.println("Enter  number :" );
    number= input.nextDouble();

    for(int i=1; i<number;i++){

      //check divisibility
      if(number%i==0){

      //print factor
        System.out.println(i+" is a factor of "+ number);
      }

   }
 }
}