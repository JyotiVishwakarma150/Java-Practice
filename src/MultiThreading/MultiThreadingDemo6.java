package MultiThreading;

public class MultiThreadingDemo6 {
    void divide(){
        int a =100,b=0,c;
        c=a/b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        Thread.currentThread().setName("deepak");
        MultiThreadingDemo6 t2 = new MultiThreadingDemo6();
        t2.divide();
    }
}
