package Challenge;
// Create  a program to create a simple calculator that uses a switch statement to perform basic arithmetic operations like addition, subtraction , multiplication,division
 import java.util.Scanner;
 class SwitchCalculator {
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.println("Welcome to our calculator in switch statement \n");
   System.out.println("Please enter your first number : ");
   int num1 = input.nextInt();
   System.out.println("Please enter your second number : ");
   int num2 = input.nextInt();
   System.out.println("enter the operation : ");
    String operation = input.next();
   int cal = switch(operation){
    case "+" -> num1 + num2;
    case "-" -> num1 - num2;
    case "*" -> num1 * num2;
    case "/" -> num1 / num2;
    default -> -1;
   };
   System.out.println("your answer is " + cal);
  }


  }

