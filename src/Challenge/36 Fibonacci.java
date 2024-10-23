package Challenge;
// create a program to print the fibonacci series up to a certain number
import java.util.Scanner;
 class Fibonacci {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to Fibonacci Series ");
         System.out.println("Please enter the number up to which series has to be printed ");
         int num = input.nextInt();
         System.out.println("Here is the fibonacci series ");
         printFibonacci(num);
     }

     public static void printFibonacci(int num) {
         if(num < 0) return;
         System.out.print("0");
         if( num == 0) return;
         System.out.print("1");
         int first = 0 , second = 1;
         while(first + second <=num){
             int third = first + second;
             System.out.print(third + " ");
             first = second;
             second = third;
         }
     }
}
