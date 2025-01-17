import java.util.*;
class Anagram{
//method to check if strings are anagram
 public static Boolean isAnagram(String s1, String s2){
    if(s1.length()!=s2.length()){
      return false;
    }
   else{
    for(int i=0;i<s1.length();i++){
     for(int j=0;j<s2.length();j++){
        if(s1.charAt(i)==s2.charAt(j)){
            return true;
       }
      }
      }
     return false;
     }
   }
 
public static void main(String args[]){
  Scanner input= new Scanner(System.in);
  System.out.println("Enter string 1: ");
  String s1= input.nextLine();
  System.out.println("Enter string 2: ");
  String s2= input.nextLine();

  //calling isAnagram()
  boolean ans= isAnagram(s1,s2);

  //display
  System.out.println("The strings are anagram? "+ans);  

  }
}