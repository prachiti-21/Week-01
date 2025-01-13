import java.util.*;
class CharacterArray{
  public char[] returnCharacters(String s){
    char[] character=new char[s.length()];
    for(int i=0; i<s.length(); i++){
      character[i]=s.charAt(i);
      
    }
    
      return character;
   
  }
 boolean isEqual(String s){
   for(int i=0;i<s.length();i++){
     if(character[i]==s.charAt(i)){
        return true;
       }
    }
   return false;
  }
 public static void main(String args[]){
   System.out.println("enter string:");
   s= input.nextLine();
   sarray= s.toCharArray();
   char[] character=new char[s.length()];
   for(int i=0;i<s.length();i++){
    if(sarray[i]==character[i]){
       System.out.println("The character array and toCharrray arrays are equal");
    }
   else{
       System.out.println("The character array and toCharrray arrays are equal");

    }
   }
   returnCharacters obj=new returnCharacters();
   System.out.println("Is character array and string equal? "+ isEqual(s,obj.returnCharacters(s)));
  
  }
}