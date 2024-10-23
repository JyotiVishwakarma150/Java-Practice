package MultiThreading;

public class MultiThreadingDemo4 implements  Runnable{
    public void run(){
        System.out.println("hiiii");
    }

    public static void main(String[] args) {
        MultiThreadingDemo4 t1 = new MultiThreadingDemo4();
        Thread t= new Thread(null,t1);
        t.start();
    }
}
