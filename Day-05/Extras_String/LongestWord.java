import java.util.*;
class LongestWord{
  public static String longest(String s){
   //String l="";
   String[] sarray=null;
   sarray= s.split(" ");

   String maxlen=sarray[0];
   //String maxlen;
   int i;
   for(i=0; i<sarray.length; i++){
      // maxlen=sarray[0];

          if(sarray[i].length()>maxlen.length()){
            maxlen=sarray[i];
     }
    }
   return maxlen;
   
  }
 public static void main(String args[]){
   Scanner input= new Scanner(System.in);
   System.out.println("Enter a sentence:");
   String s= input.nextLine();
   String ans= longest(s);
   System.out.println("Longest word is "+ans);
  }
 }