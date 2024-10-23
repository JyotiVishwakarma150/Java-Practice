package Challenge;
// create a program to calculate product of two floating  point numbers ...
import java.util.Scanner;
 class Challenge_09 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("We are doing Float Multiplication");
         System.out.println("Please enter first decimal number : ");
         double first = input.nextDouble();
         System.out.println("Now , Please enter second number :");
         double second = input.nextDouble();

         double mul = first*second;
         System.out.println("\n result is : "+mul);
     }
}
