package Challenge;

import java.util.Scanner;

// create a program to find the sum of two diagonal elements
 class DiagonalSum2DArray {
 public static void main(String[] args) {
  System.out.println("Welcome to diagonal sum");
  int[][] numArr = input2DArray();
  long sum = sumOfDiagonals(numArr);
  System.out.println("Sum of diagonals is : "+sum);

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

 public static long sumOfDiagonals(int[][] numArr) {
  long leftSum = sumOfLeftDiagonal(numArr);
  long rightSum = sumOfRightDiagonal(numArr);
  long sum = leftSum + rightSum;
  if(numArr.length % 2 != 0){
   int idx = numArr.length/2;
   sum -= numArr[idx][idx];
  }
  return sum;
 }

 public static long sumOfLeftDiagonal(int[][] numArr) {
  long sum = 0;
  int i = 0;
  while(i<numArr.length){
   sum += numArr[i][i];
   i++;
  }
  return sum;
 }
 public static long sumOfRightDiagonal(int[][] numArr) {
  long sum = 0;
  int i = 0;
  while(i<numArr.length){
   int col = numArr.length-1-i;
   sum += numArr[i][col];
   i++;
  }
  return sum;
 }
}
