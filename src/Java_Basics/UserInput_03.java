package Java_Basics;

import java.util.Scanner;
public class UserInput_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name :");
        String name = input.nextLine();
        System.out.println("Good Morning "+ name);
        System.out.println(name + " ,Also tell me your age");
        int age = input.nextInt();
        System.out.println("Your age is :" +  age);
    }
}
