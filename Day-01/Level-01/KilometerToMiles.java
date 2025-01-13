class KilometerToMiles{
public static void main(String args[]){
   //creating scanner object
   Scanner sc=new Scanner(System.in);
   System.out.println("enter distance in km: ");

  //taking input of distance in kilometer
  double km= sc.nextInt();

  //converting into miles
  double miles= km/1.6;

 //display
  System.out.println("The total miles is "+ miles+" mile"+ " for the given "+km +" km");
}
}