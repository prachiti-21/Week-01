import java.util.*;
class Lowercase{
 public String toLowercase(String text){
   char ch=' ';
   String result="";
    for(int i=0;i<text.length();i++){
      if(text.charAt(i)>='A' && text.charAt(i)<='Z'){
        ch=(char)(text.charAt(i)+32);
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
   Lowercase obj= new Lowercase();
   String ans= obj.toLowercase(text);
   System.out.println("The Lowercase text is: " +ans); 
   String upper= ans.toUpperCase();

   if(upper.equals(text)){
    System.out.println("The uppercase text and upper are equal");
   }
else{
    System.out.println("The uppercase text and upper are not equal");
  }
 System.out.print(upper);
   
  }
}
