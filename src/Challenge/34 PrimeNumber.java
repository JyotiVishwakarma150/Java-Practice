package Challenge;
// create a program to check whether a given number is prime
import java.util.Scanner;
 class PrimeNumber {
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.println("Welcome to Prime number checker");
   System.out.println("Please enter your number : ");
   int num = input.nextInt();
   boolean isPrime = isPrime(num);
   if (isPrime) {
    System.out.println("Your number is Prime");
   } else {
    System.out.println("Your number is not Prime");
   }

  }

  public static boolean isPrime(int num) {
    int i = 2;
    while(i<num){
     if(num % i == 0){
      return false;
     }
     i++;
    }
    return true;
  }
 }
