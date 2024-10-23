package Challenge;
// create a program do-while to implement a number guessing game
import java.util.Scanner;
 class NumberGuessingGame {
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   int num = 5;
   int guess;
   System.out.println("Welcome to the number guessing game \n");
   do{
    System.out.println("Please guess the number between 0 and 10 : ");
    guess = input.nextInt();
   }while(num != guess);
   System.out.println("You have successfully guessed the number");
  }
}
