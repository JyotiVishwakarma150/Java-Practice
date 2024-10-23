package MultiThreading;

public class MultiThreadingDemo5 extends Thread{
    public void run(){
        System.out.println("hi");
        System.out.println("1 : "+Thread.currentThread().getName());
        System.out.println(Thread.currentThread().isAlive());
    }
    public static void main(String[] args) {
        MultiThreadingDemo5 t1 = new MultiThreadingDemo5();
        t1.start();
        System.out.println("2 : "+Thread.currentThread().getName());
        System.out.println(t1.isAlive());
    }
}
