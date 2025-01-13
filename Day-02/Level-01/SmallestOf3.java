import java.util.*;
class SmallestOf3{
  public static void main(String args[]){
   Scanner input= new Scanner(System.in);
    int number1, number2, number3;
    System.out.println("Enter 3 numbers:");
    number1= input.nextInt();
    number2= input.nextInt();
    number3= input.nextInt();
    
    //checking if 1st number is smallest of 3 numbers
    if(number1 < number2 && number1 < number3 ){
       System.out.println("Is the first number the smallest? Yes!");
      }
    else{
      System.out.println("Is the first number the smallest? No!");

      }
 }
}