package Challenge;
// create a program to check is the array is palindrome or not
 class Palindrome {
    public static void main(String[] args) {
        System.out.println("Welcome to palindrome array\n");
        int[] arr = ArrayUtility.inputArray();
        boolean isPalindrome = isPalindrome(arr);
        if(isPalindrome){
            System.out.println("Given array is palindrome");
        } else{
            System.out.println("Given array is not palindrome");
        }
    }

    public static boolean isPalindrome(int[] arr) {
        int i = 0;
        int j = arr.length-1;
        while(i < j){
            if(arr[i] != arr[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;

    }

}
