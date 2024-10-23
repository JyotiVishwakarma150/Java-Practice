package Challenge;
// create a program that calculates grades based on marks ... A->above 90%, B->above 75%, c->above 60%, d->above 30%,F->below 30%
import java.util.Scanner;
 class Grading {
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.println("Welcome to Grade calculator\n");
   System.out.println("Please enter your percentage : ");
   int percentage = input.nextInt();
   if(percentage>=90){
    System.out.println("Great , you have got A");
   } else if(percentage>=75){
    System.out.println("Good , you have got B");
   } else if(percentage>=60){
    System.out.println("You have got C , work harder next time ");
   } else if(percentage>=30){
    System.out.println("You have got D, you seriously need to work hard");
   } else {
    System.out.println("Sorry , you have failed the test and got F");
   }
  }
}
