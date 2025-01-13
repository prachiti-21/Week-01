import java.util.*;
class SumUntil0OrNegative{
  public static void main(String args[]){
   Scanner input= new Scanner(System.in);
   double total=0.0;
   double value;
      
  
   //check if number entered is 0
   while(true){
        System.out.println("Enter number: ");
        value= input.nextInt();


         if(value<=0.0){
           break;
      }
   
    //if number is not 0 or negative  
      
      total+= value; 
    }
       System.out.println("Total is " +total);
     
    
  }

}
        