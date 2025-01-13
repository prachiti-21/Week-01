import java.util.*;
class Uppercase{
 public String toUppercase(String text){
   char ch=' ';
   String result="";
    for(int i=0;i<text.length();i++){
      if(text.charAt(i)>='a' && text.charAt(i)<='z'){
        ch=(char)(text.charAt(i)-32);
      }
      else{
       ch= (char)(text.charAt(i));
      }
      result+=ch;

    }
     
   
  return result;
  }
public static void main(String args[]){
   Scanner input= new Scanner(System.in);
   System.out.println("Enter text:");
   String text= input.nextLine();
   Uppercase obj= new Uppercase();
   String ans= obj.toUppercase(text);
   System.out.println("The Uppercase text is: " +ans); 
   String lower= ans.toLowerCase();

   if(lower.equals(text)){
    System.out.println("The lowercase text and lower are equal");
   }
else{
    System.out.println("The lowercase text and lower are not equal");
  }
 System.out.print(lower);
   
  }
}
