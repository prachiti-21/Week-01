class ConvertDistance{
public static void main(String args[]){
   //creating scanner object
   Scanner sc=new Scanner(System.in);
   double distanceInFeet;
   System.out.println("Enter distance in feets: ");

  //input distance in feets
  distanceInFeet= sc.nextDouble();

  //convert into yards
  double yards= distanceInFeet/3;

  //convert into miles
  double miles= distanceInFeet/5280;

 //display
  System.out.println("The distance "+distanceInFeet+" feet is " + yards+" in yards and "+miles+" in miles");
}
}