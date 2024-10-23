package Challenge;

import java.util.Scanner;

// create a program that determines if a number is odd or even
class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to odd even calculator\n");
        System.out.println("Please enter your number : ");
        int num = input.nextInt();
        if(num%2==0){
            System.out.println("Your number is even");
        } else{
            System.out.println("Your number is odd ");
        }
    }
}
