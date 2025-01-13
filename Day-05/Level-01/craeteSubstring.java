import java.util.*;
class Substring2{
  public String createSubstring(String s1,int start,int end){
     String sub="";
     for(int i=start; i<=end; i++){
       sub+=s1.charAt(i);
     }
   return sub;
   }
 public static void main(String args[]){
   Scanner input= new Scanner(System.in);
   System.out.println("Enter string:");
   String s1= input.nextLine();
   System.out.println("Enter start and end index:");
   int start= input.nextInt();
   int end= input.nextInt();
   Substring2 obj=new Substring2();
   System.out.println("The substring by createSubstring method: "+obj.createSubstring(););
   System.out.println("The substring by substring method: "+s1.substring(start,end) );
  }
}