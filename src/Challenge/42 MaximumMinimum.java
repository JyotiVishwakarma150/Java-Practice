package Challenge;
//create a program to find the maximum and minimum element in an array
//import java.util.Scanner;
class MaximumMinimum {
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        System.out.println("Welcome to maximum and minimum array \n");
        int[] numArr = ArrayUtility.inputArray();
        int maximum = max(numArr);
        System.out.println("Maximum element of the array is : " + maximum);
        int minimum = min(numArr);
        System.out.println("Minimum element of the array is : " + minimum);
    }

    public static int max(int[] numArr) {
        if(numArr.length == 0){
            return Integer.MIN_VALUE;
        }
        int max = Integer.MIN_VALUE;
        int i = 0;
        while(i < numArr.length){
            if(max < numArr[i]){
                max = numArr[i];
            }
            i++;
        }
        return max;
    }

    public static int min(int[] numArr) {
        int min = Integer.MAX_VALUE;
        int j = 0;
        while(j < numArr.length){
            if(min > numArr[j]){
                min = numArr[j];
            }
            j++;
        }
        return min;
    }
}
