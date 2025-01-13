import java.util.*;
class MeanHeight{
public static void main(String args[]){
   Scanner input=new Scanner(System.in);
   //initializing array
   double[] heights= new double[11];
   double sum=0;
   double mean;
   for(int i=0;i<11;i++){
      System.out.println("Enter height:");
      heights[i]= input.nextDouble();
      
     }
     for(int i=0;i<11;i++){
     //calculating sum
      sum+=heights[i];
 
      }
     //calculating mean
     mean=sum/11;
   System.out.println("The mean of heights of the players is "+mean);
 }
}