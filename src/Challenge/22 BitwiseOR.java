package Challenge;
// create a program that shows bitwise OR of two numbers
import java.util.Scanner;
 class BitwiseOR {
   public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.println("Showcasing Bitwise OR operator\n");
   System.out.println("Please enter the first number : ");
   int first = input.nextInt();
   System.out.println("Please enter the other number : ");
   int second = input.nextInt();

   int result = first | second;
   System.out.println("Result is : " + result);
  }
  }

