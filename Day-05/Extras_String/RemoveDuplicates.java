import java.util.*;
class RemoveDuplicates{
   
public static String remove(String s){
  char ch[]= s.toCharArray();
  String dup="";
  int idx=0;
  int i,j;
  for( i=0; i<ch.length; i++){
    for( j=0; j<i; j++){
      if(ch[i]==ch[j]){
       break;      
     }
    }
 if(i==j){
  dup+=ch[i];
  }
   }
  return dup ;
}

public static void main(String args[]){
   Scanner input= new Scanner(System.in);
   System.out.print("Enter a string:");
   String s= input.nextLine();
   String ans= remove(s);
   System.out.print("The modified string is: "+ans);
   }
}


