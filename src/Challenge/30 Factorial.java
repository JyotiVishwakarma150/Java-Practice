package Challenge;
// write a function that calculates the factorial of a given number
import java.util.Scanner;
 class Factorial {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to factorial : ");
         System.out.println("Please enter your number : ");
         int num = input.nextInt();
         long fact = factorial(num);
         System.out.println("factorial of "+ num + " is : " + fact);
     }

     public static long factorial(int num) {
         if(num < 2){
             return 1;
         }
         long fact = 1;
         int i = 2;
         while(i<=num){
             fact *= i;
             i++;

         }
         return fact;
     }
}
