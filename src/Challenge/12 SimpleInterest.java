package Challenge;
// create a program to calculate simple interest ... simple interest = (P*T*R)/100;
import java.util.Scanner;
 class Challenge_12 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to Simple interest calculator \n");
         System.out.println("Please enter your principle amount Rs. :");
         int principle = input.nextInt();
         System.out.println("Now,tell me your rate of interest : ");
         double rate = input.nextDouble();
         System.out.println("Now, tell me for how many years are you borrowing this money : ");
         float years = input.nextFloat();
         double interest  = ((principle*rate*years) /100);
         System.out.println("\n\n Your simple interest is Rs. "+interest);
     }
}
