import java.util.*;
class Bonus{
public static void main(String args[]){
  Scanner input = new Scanner(System.in);
  double [] salary= new double[10];
  double [] yearsOfservice= new double[10];
  double [] new_salary= new double[10];
  double [] bonus= new double[10];
  double total_bonus=0, total_salary=0,total_newsalary=0;
  
  for(int i=0;i<10;i++){
    System.out.println("Enter salary: ");
    salary[i]= input.nextDouble();
    System.out.println("Enter years of service: ");
    yearsOfservice[i]=input.nextDouble();
    
    if(salary[i]<=0 || yearsOfservice[i]<=0){
        i--;
       System.out.println("Enter salary again: ");
       salary[i]= input.nextDouble();
       System.out.println("Enter years of service again: ");
       yearsOfservice[i]= input.nextDouble();
       i++;


      }
   }
  for(int i=0;i<10;i++){ 
     if(yearsOfservice[i]>5){
        bonus[i]=5*(salary[i]/100.0);
        
     }
     else{
        bonus[i]=2*(salary[i]/100.0);
       }
       new_salary[i]= salary[i]+bonus[i];
       total_bonus+=bonus[i];
       total_salary+=salary[i];
       total_newsalary+= new_salary[i];
     
    }

  System.out.println("Total bonus is: "+total_bonus);
  System.out.println("Total salary is: "+ total_salary);
  System.out.println("Total new salary is: "+ total_newsalary);
 }
}