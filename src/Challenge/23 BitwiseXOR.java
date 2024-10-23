package Challenge;
// create a program that shows bitwise XOR of two numbers
import java.util.Scanner;

class BitwiseXOR {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.println("Showcasing Bitwise XOR operator\n");
  System.out.println("Please enter the first number : ");
  int first = input.nextInt();
  System.out.println("Please enter the other number : ");
  int second = input.nextInt();

  int result = first ^ second;
  System.out.println("Result is : " + result);
 }
}
