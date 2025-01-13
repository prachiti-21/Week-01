class Arithematic{
  public static void main(String args[]){
   //creating scanner object
   Scanner sc=new Scanner(System.in);
   float number1,number2;
   System.out.println("Enter 2 numbers: ");
   //taking input of 2 numbers
   number1=sc.nextFloat();
   number2=sc.nextFloat();

  //addition
   float add= number1 + number2;
  //subtraction
   float sub= number1 - number2;
  //multiplication
   float multi= number1 * number2;
  //division
   float div= number1 / number2;

 //display
  System.out.println(" The addition, subtraction, multiplication and division value of 2 numbers "+number1 + " and " +number2 +" is "+add+","+sub+ ","+multi+"," +" and "+ div);
}
}