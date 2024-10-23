package Challenge;

import java.util.Scanner;

// create a program that shows bitwise compliment of a number
 class BitwiseCompliment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to showcase of Not/Compliment operator\n");
        System.out.println("Please enter your number : ");
        int num = input.nextInt();

        int result = ~num;
        System.out.println("Result is : " + result);
    }
}
