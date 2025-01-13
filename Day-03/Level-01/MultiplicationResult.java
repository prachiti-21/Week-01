import java.util.*;
class MultiplicationResult{
public static void main(String args[]){
   Scanner input=new Scanner(System.in);
   int  number;
   System.out.println("Enter number: ");
   number= input.nextInt();
   int[] multiplicationResult= new int[4];
   for(int i=0;i<4;i++){
    multiplicationResult[i]= number*(i+6);

    }
  for(int i=0;i<4;i++){
     System.out.println(number+" X "+(i+6)+"="+multiplicationResult[i]);
      }
   }
}