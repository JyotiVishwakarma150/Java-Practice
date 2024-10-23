package MultiThreading.callabledemo;
class ThreadTask3 implements Runnable{
    ThreadLocal t1 = new ThreadLocal();
    public void run(){
        t1.set("deepak");
       // System.out.println(" hii : "+t1.get());
        display();
    }
    void display(){
        System.out.println("hii : "+ t1.get());
        t1.remove();
        System.out.println("hi : "+t1.get());
    }
}
public class Test3 {
    public static void main(String[] args) {
        ThreadTask3 tt = new ThreadTask3();
        Thread t = new Thread(tt);
        t.start();
    }
}
