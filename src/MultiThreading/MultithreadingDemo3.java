package MultiThreading;
class MyThread2 extends Thread{
    @Override
    public void run(){
        System.out.println("hii");
    }
}
public class MultithreadingDemo3 {
    public static void main(String[] args) {
        MyThread2 mt2=new MyThread2();
        mt2.start();
      //  mt2.start(); //it will provide an exception bcoz we cannot start one thread 2 times
    }
}
