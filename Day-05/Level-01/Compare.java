import java.util.*;
class Compare{

 public boolean areEqual(String s1,String s2){
   if(s1.length()!=s2.length()){
     return false;
}
 for(int i=0;i<s1.length();i++){

     if(s1.charAt(i)==s2.charAt(i)){
         return true;
    }
}
  return false;
}
public static void main(String args[]){
   Scanner input= new Scanner(System.in);
   System.out.println("Enter string 1:");
   String s1= input.nextLine();
   System.out.println("Enter string 2:");
   String s2= input.nextLine();
   Compare obj= new Compare();
   System.out.println("Are the strings equal? "+ obj.areEqual(s1,s2));
   System.out.println("Are strings equal by inbuilt method? "+s1.equals(s2));
  }
 }