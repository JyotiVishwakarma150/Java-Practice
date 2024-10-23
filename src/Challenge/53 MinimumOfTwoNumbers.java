package Challenge;
// create a program to find the minimum of two numbers
import java.util.Scanner;
 class MinimumOfTwoNumbers {
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.println("Welcome to Find minimum of Two Numbers\n");
   System.out.println("Please enter your first number : ");
   int num1 = input.nextInt();
   System.out.println("Please enter your second number : ");
   int num2 = input.nextInt();
   int minimumNumber = num1>num2 ? num1:num2;
   System.out.println(minimumNumber + " is minimum number");
  }

}
