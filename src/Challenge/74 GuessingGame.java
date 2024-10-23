package Challenge;
// create a number guessing game where the program selects a random number ,and the user has to guess it
 import java.util.Scanner;
 class GuessingGame {
  int random ;
  GuessingGame(){
   random = (int) Math.ceil(Math.random() * 100);
  }
  /*
  * @ param guessNumber the number that player guessed
  * @return
  * - negative if the guessed number is smaller
  * -0 if the guessed number is correct
  * -positive if the guessed number is higher
  */
 int guess(int guessNumber){
  return guessNumber-random;
 }

 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  GuessingGame game = new GuessingGame();
  System.out.println("Welcome to the guessing game guess the number between 1-100");
  int guess;
  int result;
  do {
   System.out.println("Guess the number : ");
   guess = input.nextInt();
   result = game.guess(guess);
   if(result == 0){
    System.out.println("Congrats , Your guess in correct");
   } else if(result < 0){
    System.out.println("Please Guess higher ");
   } else{
    System.out.println("Please Guess lower ");
   }

  } while(result != 0);
 }
}
