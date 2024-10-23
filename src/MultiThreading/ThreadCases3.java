package MultiThreading;
class MyThread5 extends Thread{
    public void run(){
        System.out.println("hiiii");
    }
}
class MyThread44 extends Thread{
    public void run(){
        System.out.println("hello");
    }
}
class MyThread444 extends Thread{
    public void run(){
        System.out.println("heyy");
    }
}
public class ThreadCases3 {
    public static void main(String[] args) {
        MyThread5 mt1 = new MyThread5();
        mt1.start();
        MyThread44 mt2 = new MyThread44();
        mt2.start();
        MyThread444 mt3 = new MyThread444();
        mt3.start();
    }
}
