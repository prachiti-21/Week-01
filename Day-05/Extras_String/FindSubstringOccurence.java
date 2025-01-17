import java.util.*;
class FindSubstringOccurence{
  public static int CountSubstring(String s, String sub){
    //initializing count variable to 0
    int count =0;
             
        for (int i = 0; i <= s.length()-sub.length(); i++) {
                  String hold= s.substring(i,i+sub.length());      
           
                      if(hold.equals(sub)){
                         count++;
    
                       }
                }

          
       return count;
}
   
    public static void main(String args[]){
    Scanner input= new Scanner(System.in);
    System.out.println("Enter string:");
    String s= input.nextLine();

    System.out.println("Enter substring:");
    String sub= input.nextLine();

    System.out.println("The occurance of "+sub+" is "+ CountSubstring(s,sub)+" times");


  }
 }