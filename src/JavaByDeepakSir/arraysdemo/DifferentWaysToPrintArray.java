package JavaByDeepakSir.arraysdemo;

public class DifferentWaysToPrintArray {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40};
        //way1
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        //iterate the elements in backward direction
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }
        System.out.println();
        //way2(while loop)
        int j=0;
        while(j<a.length){
            System.out.println(a[j]);
            j++;
        }
        System.out.println("---------------------------------------");
        //way3 (for each loop)
        for(int v:a){
            System.out.println(v);
        }
        System.out.println("----------------------------------------");
        String[] str ={"deepak","amit","deepesh"};
        for(String s:str){
            System.out.println(s);
        }
    }
}
