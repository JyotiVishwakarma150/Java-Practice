package JavaByDeepakSir.arraysdemo;
import java.util.Arrays;
public class ArrayDemo {
    public static void main(String[] args) {
        int[] a= {40,50,80,20,10,90};
        Arrays.sort(a);
        for(int i: a){
            System.out.print(i + " ");
        }
    }
}
