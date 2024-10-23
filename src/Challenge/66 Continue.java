package Challenge;
// create a program using continue to sum all positive numbers entered by the user ; skip any negative numbers
import java.util.Scanner;
 class Continue {
  public static void main(String[] args) {
   System.out.println("Welcome to adding positive numbers\n");
   int[] numArr = ArrayUtility.inputArray();
   int sum = 0;
   for(int num : numArr){
    if(num < 0){
     continue;
    }
    sum +=num;
   }
   System.out.println("The sum of positive number is : " + sum);
  }
}
