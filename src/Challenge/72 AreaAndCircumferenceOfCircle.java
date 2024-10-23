package Challenge;
// calculate the area and circumference of a circle for a given radius using Math.PI
import java.util.Scanner;

 class AreaAndCircumferenceOfCircle {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to area and circumference of a circle\n");
         System.out.println("Please enter the radius of the circle : ");
         double radius = input.nextInt();

         double area = Math.PI*radius*radius;
         double circumference = 2*Math.PI*radius;
         System.out.println( "The area of circle is : "+area);
         System.out.println("The circumference of circle is : " +circumference);
     }
}
