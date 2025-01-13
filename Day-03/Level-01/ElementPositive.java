import java.util.*;
class ElementPositive{
public static void main(String args[]){
   Scanner input=new Scanner(System.in);

   //initializing array
   int[] number=new int[5];
  
   //input the elements
   for(int i=0;i<number.length;i++){
      System.out.println("Enter number:");
      number[i]= input.nextInt();
      
     }
   for(int i=0;i<number.length;i++){
     if(number[i]<0){
       System.out.println("negative");
         }
     else if(number[i]==0){
       System.out.println("zero");
      }
     //check if element is positive
     else if(number[i]>0){
       
       //check even or odd
       if(number[i]%2==0){
         System.out.println(number[i]+" is even");
        }
       else{
         System.out.println(number[i]+" is odd");
           }
      }
}
    
  
   //comparing last and first element of array
   if(number[0]==number[4]){
      System.out.println("The first and last element are equal");
        }
   else if(number[0]>number[4]){
      System.out.println("The first element is greater than last ");
        }
   else{
      System.out.println("The last element is greater than first");
      }
   }
}
