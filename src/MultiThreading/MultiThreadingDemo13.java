package MultiThreading;
class MyThread8 extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println(i+ " : "+Thread.currentThread().getName());
        }
    }
}
public class MultiThreadingDemo13 {
    public static void main(String[] args) {
        MyThread8 mt4 = new MyThread8();
        mt4.start();
        Thread.yield();
        for(int i=1;i<=10;i++){
            System.out.println(i + " : "+ Thread.currentThread().getName());
        }
    }
}
