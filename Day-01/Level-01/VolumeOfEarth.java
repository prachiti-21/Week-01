class VolumeOfEarth{
public static void main(String args[]){
 //initializing radius
  double radius= 6378;

//converting into miles
  double radius_miles= radius*0.6214;

//finding volume in kilometer cubes
  double volume_in_km3=(4/3)*3.14* radius*radius*radius;

//finding volume in miles cube
  double volume_in_miles3= (4/3)*3.14* radius_miles*radius_miles*radius_miles;

//display
  System.out.println("The volume of earth in cubic kilometers is "+volume_in_km3 + " and cubic miles is "+ volume_in_miles3);
}
}
