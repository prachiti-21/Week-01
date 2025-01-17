import java.util.*;
class CompareLexico{
  public static boolean Compare(String s1,String s2){
     
     boolean flag=false;
     //if s1 comes before then true, else false
      int min_len= Math.min(s1.length(),s2.length());
     for(int i=0; i<min_len; i++){
          if(s1.charAt(i)==s2.charAt(i)){
             continue;
          
          }
           
       if(s1.charAt(i)!=s2.charAt(i)){
          if(s1.charAt(i)<s2.charAt(i)){
             flag = true;
             break;
         }
          else{
             flag = false;
             break;
           }

       }
       
             
     }
    
     
        return flag;
   }
  public static void main(String args[]){
    Scanner input= new Scanner(System.in);
    System.out.println("Enter string 1:");
    String s1= input.nextLine();
    System.out.println("Enter string 2:");
    String s2= input.nextLine();
    
    boolean ans= Compare(s1,s2);
    if(ans==true){
      System.out.println(s1+" comes before "+s2+" in lexographical order");
     }
    else{
      System.out.println(s2+" comes before "+s1+" in lexographical order");

     }
    }
}