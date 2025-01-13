class ProfitPercentage{
public static void main(String args[]){
  //initializing cost price and selling price
   double cost_price=129;
   double selling_price=191;

  //finding profit
   double profit= selling_price-cost_price;

  //finding profit percentage
   double profit_per= (profit/cost_price)*100;

  //display

  System.out.println("The cost price is INR"+cost_price+" and selling price is INR "+selling_price);
  System.out.println("The Profit is INR "+profit+" and the Profit percentage is "+profit_per); 
}
}