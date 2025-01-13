class Handshakes{
public static void main(String args[]){
   //creating scanner object
   Scanner sc=new Scanner(System.in);
   int numberOfStudents;
   System.out.println("Enter no. of Students: ");
  //input number of students
   numberOfStudents= sc.nextInt();

  //finding number of handshakes
   int number_of_handshakes= (numberOfStudents*(numberOfStudents-1))/2;

  //display
   System.out.println("The number of possible handshakes are: " +number_of_handshakes);

}
}