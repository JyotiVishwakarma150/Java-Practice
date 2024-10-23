package Challenge;
// create a program to swap teo numbers
import java.util.Scanner;
 class Challenge_07_ii {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to swapping station\n\n");
        System.out.println("Enter value of A :");
        int a = input.nextInt();
        System.out.println("Enter value of B :");
        int b = input.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("swapping done ...");
        System.out.println("Value of A is : " + a);
        System.out.println("Value of B is : " + b);
    }
}
