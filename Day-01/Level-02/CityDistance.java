class CityDistance{
public static void main(String[] args){
 Scanner input=new Scanner(System.in);
   String name,fromCity,viaCity,toCity;
   double fromToVia,viaToFinalCity;
   double time_fromToVia,time_viaToFinalCity;
   System.out.println("Enter name, origin city, via city and destination city:" );
   name= input.nextLine();
   fromCity= input.nextLine();
   viaCity= input.nextLine();
   toCity= input.nextLine();

   System.out.println("Enter distance from origin to via city:" );
   fromToVia= input.nextDouble();
   System.out.println("Enter distance from via to final city: ");
   viaToFinalCity= input.nextDouble();
   
   System.out.println("Enter time from origin to via city: ");
   time_fromToVia= input.nextDouble();
   System.out.println("Enter time from via to final city: ");
   time_viaToFinalCity= input.nextDouble();
   
   //finding total distance
   double total_distance= fromToVia + viaToFinalCity;

   //finding total time
   double total_time= time_fromToVia + time_viaToFinalCity;
   
   System.out.println("The total distance is "+total_distance+" and total time is "+total_time);
}
}