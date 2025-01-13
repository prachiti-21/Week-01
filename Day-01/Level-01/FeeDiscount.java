class FeeDiscount{
  public static void main(String args[]){
   //creating scanner object
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter fees: ");

  //input fees
  double fee= sc.nextDouble();
  System.out.println("enter discount percent: ");

  //input discount percentage
  double discountPercent=sc.nextDouble();

 //finding discount amount
  double discount= (discountPercent*fee)/100;

 //finding discounted final fees
  double discounted_fee= fee-discount;

 //display
  System.out.println("The discount amount is INR "+ discount+" and final discounted fee is INR "+discounted_fee);
}
}