class DoubleOperationPrecedence{
public static void main(String[] args){
  Scanner input=new Scanner(System.in);
    double a,b,c;
    System.out.println("enter a,b and c:" );
   //taking input a,b and c
     a=input.nextDouble();
     b=input.nextDouble();
     c=input.nextDouble();

   //doing operations 
     double result1= (a+b)*c;
     double result2= a*b+c;
     double result3= (c+a)/b;
     double result4= a % b +c;

    //display
     System.out.println("The results are: "+result1+ " "+result2+" "+result3+" "+result4);
}
}