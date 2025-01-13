import java.util.*;
class StudentVote{
public static void main(String args[]){
   Scanner input=new Scanner(System.in);
   int[] students=new int[10];
   for(int i=0;i<students.length;i++){
      System.out.println("Enter age:");
      students[i]= input.nextInt();
   }
   for(int i=0;i<students.length;i++){
      if(students[i]<0){
         System.out.println("Invalid age");
       }
      else if(students[i]>=18){
         System.out.println("The Student with age "+students[i]+" can vote");
       }
      else{
         System.out.println("The Student with age "+students[i]+" cannot vote");

       }
    }
  }
}