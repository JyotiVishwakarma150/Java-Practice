package Challenge;

import java.util.Scanner;

//create a program that computes sum of digits of an integer
 class SumOfDigits {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.println("Welcome to sum of digits ");
  System.out.println("Please enter your number : ");
  int num = input.nextInt();
  int sum = sumOfDigits(num);
  System.out.println("Sum of digits is : " + sum);
 }

 public static int sumOfDigits(int num) {
  int sum = 0;
  while(num>0){
   sum += num%10;
   num /= 10;
  }
  return sum;
 }
}
