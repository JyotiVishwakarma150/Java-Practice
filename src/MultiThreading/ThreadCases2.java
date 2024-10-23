package MultiThreading;
//performing single task from multiple thread
class MyThread4 extends Thread{
    public void run(){
        System.out.println("hii");
    }
}
public class ThreadCases2 {
    public static void main(String[] args) {
        MyThread4 mt2 = new MyThread4();
        mt2.start();
        MyThread4 mt22 = new MyThread4();
        mt22.start();
    }
}
