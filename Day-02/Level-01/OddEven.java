import java.util.*;
class OddEven{
  public static void main(String args[]){
   Scanner input= new Scanner(System.in);
   int number;
   System.out.println("enter a number: ");
   number= input.nextInt();
   //checking if number is natural
   if(number>0){

   //iterating through loop 
    for(int i=1; i<=number; i++){
       if(i%2==1){
        System.out.println(i+" is odd");
       }
       else{
        System.out.println(i+" is even");
       }
     }
    }
  }
}