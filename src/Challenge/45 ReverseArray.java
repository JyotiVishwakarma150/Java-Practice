package Challenge;
//create a program to reverse  an array
class ReverseArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Reverse Array\n");
        int[] numArr = ArrayUtility.inputArray();
         reverse(numArr);
        System.out.print("The reverse of array is : " );
        displayArray(numArr);
    }

    public static void reverse(int[] numArr) {
        int i = 0;
        int j = numArr.length-1;
        while(i < j){
            int temp = numArr[i];
            numArr[i] = numArr[j];
            numArr[j] = temp;
            i++;
            j--;
        }
    }

    public static void displayArray(int[] numArray) {
        int i = 0;
        while(i<numArray.length){
            System.out.print(numArray[i] + " ");
            i++;
        }
        System.out.println();
    }
    }

