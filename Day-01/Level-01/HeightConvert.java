class HeightConvert{
public static void main(String args[]){
   //creating scanner object
   Scanner sc=new Scanner(System.in);
    double height;
    System.out.println("Enter height in cm: ");
  //input height
    height=sc.nextDouble();

  //coverting to feet
    double feet= height*0.033;

  //coverting to inch
    double inch=  height/2.54;

 //display
  System.out.println("Your Height in cm is "+height+" while in feet is "+feet+" and inches is "+inch);
}
}