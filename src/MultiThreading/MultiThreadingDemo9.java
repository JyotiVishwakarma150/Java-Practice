package MultiThreading;
class MyThread6 extends Thread{
    public void run(){
        System.out.println("hii");
        System.out.println("child thread : "+Thread.currentThread().isDaemon());
    }
}
public class MultiThreadingDemo9 {
    public static void main(String[] args) {
        MyThread6 mt5 = new MyThread6();
        mt5.setDaemon(true);
        mt5.start();
            Thread.currentThread().setDaemon(true);
           mt5.setDaemon(true);
        System.out.println("Main thread : "+ Thread.currentThread().isDaemon());
    }
}
