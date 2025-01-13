import java.util.*;
class CountDown{
  public static void main(String args[]){
   Scanner input= new Scanner(System.in);
   int counter;
   System.out.println("Enter counter:");
   counter= input.nextInt();
   
   //counting down through while loop
   while(counter>=1){
     System.out.println("Rocket launches in "+ counter+ "...");
     counter--;
   }
 }
}
   