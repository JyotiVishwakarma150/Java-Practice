package Challenge;

import java.util.Scanner;

// WAP to check if a given number is even or odd using bitwise operators
 class OddEvenBitwise {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.println("Welcome to Odd/Even calculator\n");
  System.out.println("Please enter your number : ");
  int num = input.nextInt();

  if((num & 1)==1){
   System.out.println("Your number is odd");
  } else{
   System.out.println("Your number is even");
  }
 }
}
