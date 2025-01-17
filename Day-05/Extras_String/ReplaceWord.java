import java.util.*;
class ReplaceWord{
  public static String replaceword(String s, String word1, String word2){
    
    //inbuilt method to replace two words
    return s.replace(word1,word2);
   
  }

public static void main(String args[]){
  Scanner input= new Scanner(System.in);
  System.out.println("Enter a sentence:" );
  String s= input.nextLine();
  System.out.println("Enter word to replace:" );
  String word1= input.nextLine();
  System.out.println("Enter word to replace with:" );
  String word2= input.nextLine();
  String ans= replaceword(s,word1,word2);
  System.out.println("Replaced sentence is "+ans);

 }
}