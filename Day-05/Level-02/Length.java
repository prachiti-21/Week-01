import java.util.*;
class Length{
   public static int Stringlength(String s){
     int count=0;
     try{
     while(true){
        s.charAt(count);
        count++;
     }
}
    catch(IndexOutOfBoundsException e){
    }
      return count;
    }
  
 public static void main(String args[]){
    Scanner input= new Scanner(System.in);
    System.out.println("Enter string ");
    String s= input.nextLine();
    System.out.println("The length by user defined method is "+Stringlength(s));
    System.out.println("The length by built in method is "+s.length());
 
  }
}