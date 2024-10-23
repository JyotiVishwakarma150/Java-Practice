package MultiThreading;
class MyThread7 extends Thread{
    public void run(){
        System.out.println("hiii");
    }
}
public class MultiThreadingDemo11 {
    public static void main(String[] args) {
        MyThread7 mt2 = new MyThread7();
        mt2.start();
        mt2.setPriority(Thread.MAX_PRIORITY);
       // mt2.setPriority(Thread.MIN_PRIORITY);
        System.out.println(mt2.getPriority());
    }
}
