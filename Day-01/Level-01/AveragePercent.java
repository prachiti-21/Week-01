class AveragePercent{
public static void main(String args[]){
  //initializing variables
   int maths=94;
   int physics=95;
   int chemistry=96;

  //finding total of all marks
  double total= (double)(maths+physics+chemistry);

  //finding percentage
  double percent= (total * 100)/300;

 //display
  System.out.println("Sam’s average mark in PCM is: "+percent);
}
}