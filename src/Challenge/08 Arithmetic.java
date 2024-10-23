package Challenge;
// create a program that takes two numbers and shows result of all arithmetic operators
import java.util.Scanner;
 class Challenge_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to our arithmetic calculater ");
        System.out.println("Please enter first number :");
        int first = input.nextInt();
        System.out.println("Now, Please enter the second number :");
        int second = input.nextInt();

        int add = first + second;
        int sub = first - second;
        int mul = first * second;
        int div = first / second;
        int mod = first % second;

        System.out.println("addition is : " + add);
        System.out.println("subtraction is : " + sub);
        System.out.println("multiplication is : " + mul);
        System.out.println("division is : " + div);
        System.out.println("modulus is : " + mod);

    }
}
