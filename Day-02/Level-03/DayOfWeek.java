import java.util.*;
class DayOfWeek{
 public static void main(String args[]){ 
    Scanner input = new Scanner(System.in);
    int m,d,y;
    //taking input month,day and year
    System.out.println("Enter month: " );
    m=input.nextInt();
    System.out.println("Enter day: ");
    d=input.nextInt();
    System.out.println("Enter year: ");
    y= input.nextInt();
    
    //formula for Gregorian calender
    int y0= y- (14-m)/12;
    int x= y0+ (y0/4) - (y0/100) + y0/400;
    int m0= m+12*((14-m/12)-2);
    int d0=(d+x+(31*m0/12))%7;
    
   //display the day of week
    System.out.println("The day is "+d0 );
 }
}
