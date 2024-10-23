package Challenge;
// create a program to do sum and average of all elements in a 2D array
import java.util.Scanner;
 class SumAverage2DArray {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to sum and average of 2D array\n");
         int[][] numArr = input2DArray();
        long sum = sum(numArr);
        double avg = average(numArr);
         System.out.println("Your sum of Array is : "+ sum);
         System.out.println("Your average of array is : " + avg);

     }
     public static int[][] input2DArray(){
         Scanner input = new Scanner(System.in);
         System.out.println("Please enter the number of rows : ");
         int rows = input.nextInt();
         System.out.println("Please enter the number of columns : ");
         int columns = input.nextInt();
         int[][] numArr = new int[rows][columns];
         int i = 0;
         while(i < rows){
             int j = 0;
             while(j < columns){
                 System.out.println("Please enter element row : " + (i+1) + " , column : " + (j+1) + " :");
                 numArr[i][j] = input.nextInt();
                 j++;
             }
             i++;
         }
         return numArr;
     }

     public static double average(int[][] numArr) {
         if(numArr.length == 0){
             return 0;
         }
         int rows = numArr.length; // number of rows pata chalega
         int cols = numArr[0].length;// number of columns pta chlta h
         double size = rows * cols;
         return sum(numArr)/size;
     }

     public static long sum(int[][] numArr) {
         long sum = 0;
         int i = 0;
         while(i < numArr.length){
             int j = 0;
             while(j < numArr[i].length){
                 sum += numArr[i][j];
                 j++;
             }
             i++;
         }
         return sum;
     }
 }
