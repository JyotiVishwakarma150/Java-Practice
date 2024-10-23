package Challenge;
// create a program to reverse the digits of a number
import java.util.Scanner;
class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to reverse ");
        System.out.println("Please enter your number : ");
        int num = input.nextInt();
        int reverse = reverse(num);
        System.out.println("Reverse of your number is : " + reverse );
    }

    public static int reverse(int num) {
        int r = 0;
        while(num>0){
            r *= 10;
            r += (num % 10);
            num /= 10;
        }
        return r;
    }
}
