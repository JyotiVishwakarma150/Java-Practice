package Challenge;
// create a program using break to read inputs from the user in a loop and break the loop if a specific keyword (like "exit") is entered
import java.util.Scanner;
 class Break {
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.println("Welcome in break statement \n");
   int i = 1;
   while(i > 0){
    System.out.print("Please enter your specific keyword : ");
    String name = input.nextLine();
   if(name.equals("exit")){
    break;
   }
    System.out.println();
    }

   }

}
