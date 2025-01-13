class NumberOfPens{
  public static void main(String args[]){
  //initializing number of pens and students
   int pens=14;
   int students=3;

 //finding number of pens each student will get
   int pen_get=pens/students;

 //finding remaining pens
   int remaining=pens%students;

 //display
   System.out.println("The Pen Per Student is "+pen_get+" and the remaining pen not distributed is "+remaining);
}
}