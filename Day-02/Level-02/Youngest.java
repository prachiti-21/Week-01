import java.util.*;
class Youngest{
 public static void main(String args[]){ 
    Scanner input = new Scanner(System.in);
    double age_amar,age_akbar,age_anthony,height_amar,height_akbar,height_anthony;
    //input ages
    System.out.println("Enter ages:");
    age_amar= input.nextDouble();
    age_akbar=input.nextDouble();
    age_anthony= input.nextDouble();
    
   //input heights
    System.out.println("Enter heights" );
    height_amar= input.nextDouble();
    height_akbar= input.nextDouble();
    height_anthony=input.nextDouble();
    
   //find youngest friend
    if(age_amar<age_akbar && age_amar<age_anthony){
      System.out.println("Amar is youngest");
    }
    else if(age_akbar<age_amar && age_akbar<age_anthony){
      System.out.println("Akbar is youngest");
    }
    else if(age_anthony<age_amar && age_anthony<age_akbar){
      System.out.println("Anthony is youngest");
    }
   //find tallest friend
    if(height_amar>height_akbar && height_amar>height_anthony){
      System.out.println("Amar is tallest");
    }
    else if(height_akbar>height_amar && height_akbar>height_anthony){
      System.out.println("Akbar is tallest");
    }
    else if(height_anthony>age_amar && height_anthony>age_akbar){
      System.out.println("Anthony is tallest");
    }
  }
}

    
  
    