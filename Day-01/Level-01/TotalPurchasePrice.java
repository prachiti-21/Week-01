class TotalPurchasePrice{
public static void main(String args[]){
   //creating scanner object
   Scanner sc=new Scanner(System.in);
   double unitPrice;
   int quantity;
   System.out.println("Enter unit price and quantity: " );

   //input unit price and quantity
   unitPrice= sc.nextDouble();
   quantity= sc.nextInt();

   //finding total price
   double total_price= unitPrice*quantity;

   //display
   System.out.println("The total purchase price is INR "+total_price+ " if the quantity is "+quantity+" and unit price is INR "+unitPrice );
}
}