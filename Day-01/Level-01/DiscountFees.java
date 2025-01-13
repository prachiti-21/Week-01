class DiscountFees{
public static void main(String args[]){
 //initializing fees and discount
  double fee= 125000;
  double discount= 10;

//finding discount amount
  discount=(125000/100)*10;

//finding final discounted price
  double discounted_price= fee-discount;

//display
  System.out.print("The discount amount is INR "+discount+ " and final discounted fee is INR "+discounted_price);
}
}