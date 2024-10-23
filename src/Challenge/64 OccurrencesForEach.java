package Challenge;
// create a program to find
import java.util.Scanner;
 class OccurrencesForEach {
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.println("Welcome to finding occurrences\n");
   System.out.println("Please enter the number of elements : ");
   int size = input.nextInt();
   int[] nums = new int[size];
   int i = 0;
   while(i<size){
    System.out.println("Please enter element no " + i + " :");
    nums[i] = input.nextInt();
    i++;
   }
   System.out.println("Now enter the number you want to find : ");
   int element = input.nextInt();

   }
  }



