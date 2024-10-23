package Challenge;
// create a program using for loop multiplication table for a number
import java.util.Scanner;
 class MultiplicationTableFor {
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.println("Welcome to multiplication table\n");
   System.out.println("Please enter your number  :");
   int num = input.nextInt();
   printMultiplicationTableFor(num);
  }

  public static void printMultiplicationTableFor(int num) {
     for(int i = 1; i <= 10 ; i++){
      System.out.println(num + "x"  + i + "=" + (num*i));
     }
  }
}
