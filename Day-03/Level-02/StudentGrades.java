import java.util.Scanner;

public class StudentGrades {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input: Number of students
        System.out.print("Enter the number of students: ");
        int students = input.nextInt();
        double[] physics= new double[students];
        double[] chemistry= new double[students];
        double[] maths= new double[students];


        double[] percent= new double[students];
        char[] grades= new char[students];
        
        //input marks
        for(int i=0;i<students;i++){
           System.out.println("Enter marks of physics of student:"+(i+1));
           physics[i]= input.nextDouble();
          
           System.out.println("Enter marks of chemistryof student:"+(i+1));
           chemistry[i]= input.nextDouble();
           
           System.out.println("Enter marks of mathsof student:"+(i+1));
           maths[i]= input.nextDouble();
           
           //check if marks are negative
           if(physics[i]<0 || chemistry[i]<0 || maths[i]<0){
              i--;
              System.out.println("Enter positive marks of physics:");
              physics[i]= input.nextDouble();
              
              System.out.println("Enter positive marks of chemistry:");
              chemistry[i]= input.nextDouble();
              
              
              System.out.println("Enter positive marks of maths:");
              maths[i]= input.nextDouble();
              i++;

            }
           
        }
      for(int i=0;i<students;i++){
          //calculating percentage
          percent[i]= ((physics[i]+chemistry[i]+maths[i])/300)*100;
          
          if(percent[i]>=80){
             grades[i]='A';
           }
          else if(percent[i]>=70 && percent[i]<=79){
             grades[i]='B';
           }
          else if(percent[i]>=60 && percent[i]<=69){
            grades[i]='C';
           }
          else if(percent[i]>=50 && percent[i]<=59){
            grades[i]='D';
            }
          else if(percent[i]>=40 && percent[i]<=49){
            grades[i]='E';
            }
          else if(percent[i]<=39){
            grades[i]='R';
            }
         }
      for(int i=0;i<students;i++){
          if(grades[i]=='A'){
            System.out.println("student "+(i+1)+" Level 4, above agency-normalized standards");
           }
          else if(grades[i]=='B'){
            System.out.println("student "+(i+1)+" Level 3, at agency-normalized standards");
           }
          else if(grades[i]=='C'){
           System.out.println("student "+(i+1)+" Level 2, below,but approaching agency-normalized standards");
          }
          else if(grades[i]=='D'){
           System.out.println("student "+(i+1)+" Level 1, well below agency-normalized standards");
          }
          else if(grades[i]=='E'){
           System.out.println("student "+(i+1)+" Level 1-, too below agency-normalized standards");
          }
          else if(grades[i]=='R'){
          System.out.println("student "+(i+1)+" Remedial Standards");
          }
          
      }
   }
}
      


        