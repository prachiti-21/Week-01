import java.util.*;
class TwoDimensionalw{
public static void main(String args[]){
  Scanner input = new Scanner(System.in);
  int rows,column;
  //no of rows
  System.out.println("Enter rows: ");
  rows= input.nextInt();
  
  //no of columns
  System.out.println("Enter columns: ");
  column= input.nextInt();
  
  //declaring matrix
  int[][]matrix= new int[rows][column];
  int[] array= new int[rows*column];
  int index=0;
  for(int i=0;i<rows;i++){
     for(int j=0;j<column;j++){
       System.out.println("Enter matrix elements:");
       matrix[i][j]= input.nextInt();
      } 
 }
  //storing matrix elements in 1-D array
  for(int i=0;i<rows;i++){
     for(int j=0;j<column;j++){
        array[index]=matrix[i][j];
        index++;
    }
}
  //displaying 1-D array
 System.out.println("Single dimensional array is: ");
 for(index=0; index<array.length;index++){
   System.out.print(" "+ array[index]);
  }
 }
}
