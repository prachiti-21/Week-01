import java.util.*;
class SumOfNaturalNosFor{
  public static void main(String args[]){
   Scanner input= new Scanner(System.in);
   int number;
   System.out.print("Enter no:");
   number= input.nextInt();
   int sum=0;
   
   //check if the number is a natural number
   if(number>0){
      for(int i=1;i<=number;i++){
      sum+= i;
     
    }
  }
  
  int sum2= number*(number+1)/2;
  if(sum==sum2){
    System.out.print("The sums are same i.e "+sum);
   }
  else{
    System.out.print("The sums are not same");
   }
 }
}
