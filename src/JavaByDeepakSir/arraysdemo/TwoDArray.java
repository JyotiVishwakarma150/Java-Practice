package JavaByDeepakSir.arraysdemo;

public class TwoDArray {
    public static void main(String[] args) {
       // TwoDArray ob = new TwoDArray();
       // System.out.println(ob);
       // int[] a={10,20,30};
        // System.out.println(a);
        int[][] a = {{10,20,30},{40,50,60}};
        System.out.println(a);
        System.out.println(a[0]);
        System.out.println(a[0][0]);
      //  System.out.println(a[0][0][0]);
        System.out.println("----------------------------------");
        System.out.println(a.length);
        System.out.println(a[0].length);
        //System.out.println(a[0][0].length);
        System.out.println("----------------------------");
        int[][] b = {{10,20,30},{40,50,60}};
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
                System.out.print(b[i][j]+ " ");
            }
            System.out.println();
        }

    }
}
