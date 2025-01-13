import java.util.*;
class FactorialFor{
  public static void main(String args[]){
   Scanner input= new Scanner(System.in);
   int integer;
   System.out.println("enter integer: ");
   integer= input.nextInt();
   int fac=1;
   if(integer>0){
     //finding factorial
    
      for(int i=1; i<=integer; i++){
        fac= fac*i;
       
      }
    }
   System.out.println("The factorial is: " +fac);
 }
}