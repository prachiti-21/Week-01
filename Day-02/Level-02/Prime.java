import java.util.*;

class Prime{
 public static void main(String args[]){ 
    Scanner input = new Scanner(System.in);
    int number;
    System.out.println("enter a no. ");
    number= input.nextInt();
    boolean isPrime=true; 
    for(int i=2;i<number;i++){
       
             if(number%i==0){
               isPrime=false;

                break;
                }
              }
           
           if(isPrime){
            System.out.println(number+" is a prime number");
           }
          else{
            System.out.println(number+" is not a prime number");

           }
      }
}