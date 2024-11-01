package JavaQuestionByDeepakSir;

public class BubbleSort {
    static void sortingAlgo(int[] a){
        for(int pass=0;pass<a.length;pass++){
            int temp;
            boolean b=false;
            for(int i=0;i<a.length-1-pass;i++){
                if(a[i]>a[i+1]){
                    temp = a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;

                    b=true;

                }
            }
            if(b==false){
                break;
            }
        }
        System.out.println("final list");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {30,60,40,70,20,10,90};
        BubbleSort.sortingAlgo(arr);
    }
}
