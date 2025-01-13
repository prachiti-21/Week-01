import java.util.*;
class Factorial{
  public static void main(String args[]){
   Scanner input= new Scanner(System.in);
   int integer;
   System.out.println("enter integer: ");
   integer= input.nextInt();
   int fac=1;
   if(integer>0){
     //finding factorial
     int i=1;
      while(i<=integer){
        fac= fac*i;
        i++;
      }
    }
   System.out.println("The factorial is: " +fac);
 }
}