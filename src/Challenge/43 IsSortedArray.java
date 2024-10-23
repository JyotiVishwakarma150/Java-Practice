package Challenge;

 class IsSortedArray {
  public static void main(String[] args) {
   System.out.println("Welcome to Array Sorting Checker\n");
   int[] numArr = ArrayUtility.inputArray();
   boolean isInc = isIncreasing(numArr);
   boolean isDec = isDecreasing(numArr);
   if(isInc || isDec){
    System.out.println("Your array is sorted ");
   } else {
    System.out.println("Your array is not sorted ");
   }
  }

  public static boolean isDecreasing(int[] numArr) {
       int i = 0;
       while(i < numArr.length-1){
        if(numArr[i] > numArr[i+1]){
         return false;
        }
        i++;
       }
       return true ;
  }

  public static  boolean isIncreasing(int[] numArr) {
     int i = 0;

     while(i < numArr.length-1){
      if(numArr[i] < numArr[i+1]){
       return false ;
      }
      i++;
     }
     return true;
  }
}
