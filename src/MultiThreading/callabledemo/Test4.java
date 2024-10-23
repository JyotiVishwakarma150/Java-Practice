package MultiThreading.callabledemo;
class ThreadTask4 implements  Runnable{
    ThreadLocal t1;
    public ThreadTask4(ThreadLocal t1){
        this.t1=t1;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName()+ " : "+t1.get());
    }
}
public class Test4 {
    public static void main(String[] args) {
        ThreadLocal tl = new ThreadLocal();
        tl.set(100);
        System.out.println(Thread.currentThread().getName()+ " : "+tl.get());
        ThreadTask4 tt = new ThreadTask4(tl);
        Thread t = new Thread(tt);
        t.start();
    }
}
