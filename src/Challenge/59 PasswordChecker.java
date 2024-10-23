package Challenge;
// create a program using do-while to find password checker until a valid password is entered
import java.util.Scanner;
 class PasswordChecker {
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.println("Welcome to set your password \n");
   String password;
   do{
    System.out.println("Please enter your password : ");
    password = input.next();

   } while(!isValidPassword(password));
   System.out.println("Thanks for entering a valid password");

  }

  public static boolean isValidPassword(String password) {
   return password.length()>6;
  }
}
