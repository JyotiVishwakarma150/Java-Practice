package Challenge;
// Create a program that determine if a number is positive ,negative ,or zero
import java.util.Scanner;
 class PositiveNegativeZero {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to number checker\n");
         System.out.println("Please enter your number : ");
         int num = input.nextInt();
         if(num>2){
             System.out.println("Your number is positive");
         } else if(num==0){
             System.out.println("Your number is zero");
         } else{
             System.out.println("Your number is negative ");
         }
     }
}
