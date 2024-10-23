package Challenge;
// create a program using for to display if a number is prime or not
import java.util.Scanner;
 class PrimeFor {
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.println("Welcome to prime number checker\n");
   System.out.println("Please enter your number : ");
   int num = input.nextInt();
   boolean isPrime = isPrime(num);
   if(isPrime){
    System.out.println("Given number is prime");
   } else{
    System.out.println("Given number is not prime");
   }
  }

  public static boolean isPrime(int num) {
   for(int i = 2 ; i < num ; i++){
    if(num % i == 0){
     return false;
    }

   }
   return true;
  }
}
