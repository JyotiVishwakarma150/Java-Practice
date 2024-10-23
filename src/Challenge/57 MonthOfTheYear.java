package Challenge;
// create a program to print the month of the year based on a number (1-12) input by the user
import java.util.Scanner;
 class MonthOfTheYear {
  public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
   System.out.println("Welcome to Month of the year\n");
   System.out.println("Enter your month in number :");
   int month = input.nextInt();
   newSwitch(month);
  }

  public static  void newSwitch(int month) {
      String monthStr = switch(month){
       case 1 -> "January";
       case 2 -> "February";
       case 3 -> "March";
       case 4 -> "April";
       case 5 -> "May";
       case 6 -> "June";
       case 7 -> "July";
       case 8 -> "August";
       case 9 -> "september";
       case 10 -> "October";
       case 11 -> "November";
       case 12 -> "December";
       default -> "Invalid";
      };
   System.out.println(monthStr);
  }
}
