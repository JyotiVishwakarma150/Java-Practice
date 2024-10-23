package Challenge;
// create a program that shows use of left shift operator
import java.util.Scanner;
class LeftShift
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to LeftShift operator\n");
        System.out.println("Please enter your number : ");
        int num = input.nextInt();

        int result = num << 4; // koi bhi number le sakte
        System.out.println("Result is : " + result);
    }
}
