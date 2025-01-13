import java.util.*;
class SpringSeason{
  public static void main(String args[]){
   Scanner input= new Scanner(System.in);
   int month,day;
   System.out.println("Enter month and day: ");
   month= input.nextInt();
   day= input.nextInt();
   
  //check whether its spring or not
   if((month==3 && day>=20) ||  month==4 || month==5 || (month==6 && day<=20)){
    System.out.println("Its a Spring season");
   }
   else{
    System.out.println("Not a Spring season");
  }

 }

}