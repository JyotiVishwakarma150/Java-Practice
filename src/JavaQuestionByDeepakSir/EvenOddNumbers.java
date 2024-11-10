package JavaQuestionByDeepakSir;

public class EvenOddNumbers {
    public static void main(String[] args) {
        int[] arr = {30, 13, 20, 10, 50, 57, 90};
        int evenNo = 0;
        int OddNo =0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]%2==0){
                evenNo=evenNo+1;
            }
            else{
                OddNo=OddNo+1;
            }


        }
        System.out.println("Number of Even Number : "+evenNo);
        System.out.println("Number of odd Number : "+OddNo);
    }
}
