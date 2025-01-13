import java.util.*;
class Bmi{
 public static void main(String args[]){ 
    Scanner input = new Scanner(System.in);
    double weight,height;
    System.out.println("Enter weight and height:");
    weight= input.nextDouble();
    height= input.nextDouble();

    // calculating bmi
    double bmi_m2= (weight/(height*height))* 10000;
    
       
    //status
    if(bmi_m2<=18.4){
      System.out.println(bmi_m2+" Underweight");
    }
   
    else if(bmi_m2>=18.5 && bmi_m2<=24.9){
      System.out.println(bmi_m2+" Normal");
    }
    else if(bmi_m2>=25.0 && bmi_m2<=39.9){
      System.out.println(bmi_m2+" Overweight");
    }
    else if(bmi_m2>=40){
      System.out.println(bmi_m2+" Obese");
    }
  }
}
    