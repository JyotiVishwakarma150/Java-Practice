package Challenge;
// create a program to search an element in 2D array
import java.util.Scanner;
 class Search2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to 2D array\n");
        int[][] numArr = input2DArray();
        System.out.println("Now enter the number you want to search : ");
        int num = input.nextInt();
        boolean isFound = search(numArr , num);
        if(isFound){
            System.out.println("Your number was found ");
        } else {
            System.out.println("Your number wsa not found ");
        }
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

    public static boolean search(int[][] numArr ,int num) {
        int i = 0;
        while(i < numArr.length){
            int j = 0 ;
            while(j < numArr[i].length){
                if(numArr[i][j] == num){
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}
