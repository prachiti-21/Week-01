import java.util.*;
class Vote{
  public static void main(String args[]){
   Scanner input= new Scanner(System.in);
   int age;
   System.out.print("Enter age: ");
   age= input.nextInt();
   
  //check if age is greater than 18 or not
   if(age >= 18){
     System.out.println("The person's age is "+age+ " and can vote");
    }
   else{
     System.out.println("The person's age is "+age+" and cannot vote");
    }
   }
}