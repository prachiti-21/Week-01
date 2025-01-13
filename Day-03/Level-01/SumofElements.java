import java.util.*;
class SumofElements{
public static void main(String args[]){
   Scanner input=new Scanner(System.in);
   double[] array= new double[10];
   double number;
   double sum=0;
   int i=0;
   while(true){
    System.out.println("Enter number: ");
    number= input.nextDouble();
    if(number<=0){
       break;
     }
    else{
      array[i]= number;
      i++;
    }
    if(i>=10){
      break;
     }
   }
  for(i=0;i<10;i++){
     sum+=array[i];
   }
  System.out.println("The total of the array elements is "+sum);
 }
}