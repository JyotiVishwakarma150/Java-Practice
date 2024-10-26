package JavaByDeepakSir.arraysdemo;

public class ArraysTest1 {
    public static void main(String[] args) {
        int[] a=new int[3];
        a[0] = 10;
        a[1]= 20;
        a[2] = 30;
        System.out.println("array length : "+a.length);
        System.out.println("----------------------------------------");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
