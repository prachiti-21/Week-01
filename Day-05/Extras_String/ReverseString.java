import java.util.*;
class ReverseString{

//method to reverse the string
public static String Reverse(String s){
   //to store reversed string
  String rev="";
   
  for(int i=s.length()-1;i>=0;i--){
   
    rev+=s.charAt(i);
   } 
  return rev; 
    }

  
public static void main(String[] args){
  Scanner input= new Scanner(System.in);
  System.out.println("Enter a string: ");

  //input string
  String s= input.nextLine();
  String reversestring= Reverse(s);
   System.out.println("The reversed string of "+s+" is "+reversestring);

 
}
}