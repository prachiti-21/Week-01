class AreaOfTriangle{
public static void main(String args[]){
   //creating scanner object
   Scanner sc=new Scanner(System.in);
   double base,height;
   System.out.println("Enter base and height of triangle in cm: ");

   //input base and height
   base=sc.nextDouble();
   height=sc.nextDouble();

   //finding area in centimeter squares
   double area_cm2= (1/2)*base*height;

   //finding area in inches squares
   double area_inch2= area_cm2/(2.54*2.54);

   //display
   System.out.println("Area in square inches is "+area_inch2+" and in square cm is "+ area_cm2);
}
}