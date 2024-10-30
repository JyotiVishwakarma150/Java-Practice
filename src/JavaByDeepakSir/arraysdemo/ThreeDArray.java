package JavaByDeepakSir.arraysdemo;

public class ThreeDArray {
    public static void main(String[] args) {
        int [][][] a = {{{10,20,30},{40,50,60}},{{70,80,90},{100,200,300}}};
        System.out.println(a);
        System.out.println(a[1]);
        System.out.println(a[0][0]);
        System.out.println(a[0][0][0]);
        System.out.println("-----------------------------------------");
        System.out.println(a.length);
        System.out.println(a[0].length);
        System.out.println(a[0][0].length);
       // System.out.println(a[0][2].length);
        System.out.println("---------------------------------------------");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                for(int k=0;k<a[i][j].length;k++){
                    System.out.println(a[i][j][k]);


                }
            }
        }
    }
}
