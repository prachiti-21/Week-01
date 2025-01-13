import java.util.*;
class CountDownFor{
  public static void main(String args[]){
   Scanner input= new Scanner(System.in);
   int counter;
   System.out.println("Enter counter:");
   counter= input.nextInt();
   
  //counting down using for loop
   for(int i=counter; i>=1; i--){
     System.out.println("Rocket launches in "+ i+ "...");

    }
  }
}