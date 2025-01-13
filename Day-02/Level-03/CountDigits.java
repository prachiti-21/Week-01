import java.util.*;
class CountDigits{
 public static void main(String args[]){ 
    Scanner input = new Scanner(System.in);
    int number,origin;
    
    System.out.println("Enter  number :" );
    number= input.nextInt();
    origin=number;
    int count=0;
    //iterating through while loop
    while(origin!=0){
     origin= origin/10;
     count+=1;
     
    }
  //display
   System.out.print(number+" has "+count+" digits");

 }
}