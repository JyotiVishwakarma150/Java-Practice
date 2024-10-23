package Challenge;
// create a program to find if the given number is even or odd
import java.util.Scanner;
 class EvenOdd {
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.println("Welcome to Find odd even numbers\n");
   System.out.println("Please enter your number : ");
   int num = input.nextInt();

   String result = (num % 2 == 0) ? "is Even" : " is Odd";
   System.out.println("Your number" + result);

  }


}
