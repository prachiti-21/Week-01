import java.util.*;
class OddEven{
public static void main(String args[]){
   Scanner input=new Scanner(System.in);
   int  number;
    System.out.println("Enter number");
     number= input.nextInt();
     if(number<=0){
       System.out.println("Error");
       
     }
   int size= number/2 +1;

     
   int[] even= new int[size];
   int[] odd = new int[size];
   int evenidx=0;
   int oddidx=0;
    for(int i=1;i<=number;i++){
     if(i%2==0){
      even[evenidx]=i;
      evenidx++;
     }
     else{
      odd[oddidx]=i;
      oddidx++;
     }
         
   }
  System.out.println("Even array:");
  for(int i=0;i<evenidx;i++){
    System.out.println(even[i]);
  }
 System.out.println("Odd array:");
  for(int i=0;i<oddidx;i++){
    System.out.println(odd[i]);
  }
 }
}

