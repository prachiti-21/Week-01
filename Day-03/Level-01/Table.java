import java.util.*;
class Table{
public static void main(String args[]){
   Scanner input=new Scanner(System.in);
   int number;
   System.out.println("Enter number:");
   number= input.nextInt();
   int[] table=new int[11];
   for(int i=1;i<=10;i++){
     table[i]= number*i;
    }
   for(int i=1;i<=10;i++){
     System.out.println(number+"X"+i+"="+table[i]);
    }
  }
}
