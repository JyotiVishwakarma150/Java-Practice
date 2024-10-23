package MultiThreading;
class MyThread14 extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println(Thread.currentThread().getName()+" : "+i);
        }
    }
}
public class Test0 {
    public static void main(String[] args) {
        MyThread14 mt = new MyThread14();
        mt.start();
        MyThread14 mt2 = new MyThread14();
        mt2.start();
    }
}
