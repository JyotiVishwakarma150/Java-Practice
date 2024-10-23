package Challenge;
// create a program to return a new array deleting a specific element
import java.util.Scanner;
 class DeleteFromArray {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to delete from array\n");
         int[] numArr = ArrayUtility.inputArray();
         System.out.println("Now enter the number you want to delete in array : ");
         int num = input.nextInt();
        deleteArr(numArr , num);


     }

     public static void deleteArr(int[] numArr,int num) {
         int[] newArr = new int[numArr.length-1];
          int i = 0;
          while(i < numArr.length){
              if(numArr[i] != num){
                  numArr[i] = newArr[i];
              } else{
                  i--;
              }
              i++;
          }
          int j = 0;
          while(j < newArr.length){
              System.out.println("Your new array is : ");
              System.out.print(j + " ");
              j++;
          }
     }
}
