import java.util.*;
class RemoveCharacter{

   //method to remove character 
    public static String remove(String s,char ch){

     //initializing empty string
     String rem="";

     for(int i=0;i<s.length();i++){
        if(s.charAt(i)!=ch){
          rem+=s.charAt(i);
         }
      }
    return rem;
}
    public static void main(String args[] ){
      Scanner input= new Scanner(System.in);
      System.out.println("Enter string:");
      String s= input.nextLine();
      System.out.println("Enter character to remove: ");
      char ch= input.next().charAt(0);

      //calling remove() method
      String ans= remove(s,ch);

     //display
     System.out.println("String after removing the specific character is :"+ans);
   }
 }