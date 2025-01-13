class SideOfSquare{
public static void main(String args[]){
   //creating scanner object
   Scanner sc=new Scanner(System.in);
   double perimeter;
   System.out.println("Enter perimeter: ");
  //input perimeter
   perimeter= sc.nextDouble();

  //finding side
  double side= perimeter/4;

  //display
  System.out.println("The length of the side is "+side+" whose perimeter is "+perimeter);
}
}