package Challenge;
// create a program to calculate compound interest ...compound interest = P(1+R/100);
import java.util.Scanner;


 class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to compound interest calculator \n");
        System.out.println("Please enter your principle amount Rs. :");
        int principle = input.nextInt();
        System.out.println("Now,tell me your rate of interest : ");
        double rate = input.nextDouble();
        System.out.println("Now, tell me for how many years are you borrowing this money : ");
        float years = input.nextFloat();
        double compInt = principle * Math.pow((1+rate/100),years);
        System.out.println("\n\n Your compound interest is Rs. "+compInt);
    }
}

