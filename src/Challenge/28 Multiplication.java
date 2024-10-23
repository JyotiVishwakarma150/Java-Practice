package Challenge;
import java.util.Scanner;
class Multiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Multiplication world ");
        System.out.println("Please enter your number : ");
        int num = input.nextInt();
        printMultiplicationTable(num);
    }

    public static void printMultiplicationTable(int num) {
        int i = 1;
        while(i<=10){
            System.out.println(num + "x" + i + "=" + (num*i) );
            i++;
        }
    }
}
