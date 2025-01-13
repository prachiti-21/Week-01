import java.util.*;
class Multiple{
 public static void main(String args[]){ 
    Scanner input = new Scanner(System.in);
    double number;
    System.out.println("Enter  number :" );
    number= input.nextDouble();
    
   //iterating for loop
   for(int i=100;i>=1;i--){
    if(i%number==0){

       System.out.println(i+" is multiple of "+number);

      }
    }
  }
}
