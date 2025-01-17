import java.util.*;
class ToggleCase{
  public static String toggle(String s){
     String result="";
     char ch=' ';
     for(int i=0; i<s.length(); i++){
        if(s.charAt(i)>='a' && s.charAt(i)<='z'){
          ch= (char)(s.charAt(i)-32);
         }
        else if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
         ch= (char)(s.charAt(i)+32);
        }
     result+=ch;
    }
     return result;
  }
   public static void main(String args[]){
      Scanner input= new Scanner(System.in);
      System.out.println("Enter string:");
      String s= input.nextLine();
      
      System.out.println("The toggled String is: "+ toggle(s));
    }
  }