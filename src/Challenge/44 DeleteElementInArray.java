package Challenge;
import java.util.Scanner;
 class DeleteElementInArray {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to Array deletion\n");
         int[] numArr = ArrayUtility.inputArray();
         System.out.println("Now , enter then number you want to delete : ");
         int numToDelete = input.nextInt();
         int[] newArr = deleteNumber(numArr,numToDelete);
         System.out.println("Here is your new array");
         displayArray(newArr);
     }

     public static int[] deleteNumber( int[] numArr , int numToDelete) {
         int occ = OccurrenceArray.noOfOccurrences(numArr,numToDelete);
         if(occ == 0){
             return numArr;
         }
         int newSize = numArr.length - occ;
         int[] newArr = new int[newSize];

         int i = 0 , j = 0;
         while(i < numArr.length){
             if(numArr[i] != numToDelete){
                 newArr[j] = numArr[i];
                 j++;
             }
             i++;
         }
         return newArr;
     }

     public static void displayArray(int[] numArray) {
         int i = 0;
         while(i < numArray.length){
             System.out.print(numArray[i] + " ");
             i++;
         }
         System.out.println();
     }
}
