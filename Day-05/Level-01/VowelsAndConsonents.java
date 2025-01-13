import java.util.*;
class VowelsAndConsonents{
public static void main(String args[]){
  Scanner input= new Scanner(System.in);
  System.out.println("Enter a string: ");

  //input string
  String s= input.nextLine();

  //initializing counter for vowels and consonents
  int count_vowels=0,count_cons=0;
  for(char c:s.toCharArray()){
    //count number of vowels
      //char c=s.charAt(i);
     if(( c=='a' || c=='A')|| (c=='e' || c=='E') || (c=='i' || c=='I') || (c=='o' ||  c=='O') || (c=='u' || c=='U')){
       count_vowels++;
      }
     else{
       //count number of consonents
       count_cons++;
      }
    }
  //display
  System.out.println("Number of vowels int the string is "+count_vowels);
  System.out.println("Number of consonents int the string is "+count_cons);

  
  }
}