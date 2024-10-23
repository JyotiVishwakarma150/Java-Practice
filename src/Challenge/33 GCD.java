package Challenge;
// create a program to find the greatest common divisor (GCD) of two numbers
import java.util.Scanner;
 class GCD {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Please enter your number : ");
         int first = input.nextInt();
         System.out.println("Please enter your second number : ");
         int second = input.nextInt();
         int gcd = gcd(first , second);
         System.out.println("GCD of the two numbers is : " + gcd);
     }

     public static int gcd(int first , int second) {
         int i=2;
         int gcd = 1;
         int least = least(first , second);
         while(i<=least){
             if(first % i == 0 && second % i == 0){
                 gcd = i;
             }
             i++;
         }
         return gcd;
     }

     public static int least(int first , int second) {
       if(first < second) return first;
               else return second;
     }
}
