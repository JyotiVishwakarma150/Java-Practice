package MultiThreading;
class MyThread0 extends Thread{
    public void run(){
        System.out.println("hii : "+ Thread.currentThread().getName());
        System.out.println("Child thread priority : "+ Thread.currentThread().getPriority());
    }
}
public class MultiThreadingDemo10 {
    public static void main(String[] args) {
        MyThread0 mt = new MyThread0();
        mt.start();
//        mt.setPriority(8);
//        System.out.println("Child thread priority : "+ mt.getPriority());
        Thread.currentThread().setPriority(8);
        System.out.println("hello : "+ Thread.currentThread().getName());
        System.out.println("Main thread priority : "+ Thread.currentThread().getPriority());
    }
}
