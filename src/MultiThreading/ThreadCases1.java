package MultiThreading;
//performing single task from single Thread
class MyThread3 extends Thread{
    public void run(){
        System.out.println("hiii");
    }
}
public class ThreadCases1 {
    public static void main(String[] args) {
        MyThread3 mt1 = new MyThread3();
        mt1.start();
    }
}
