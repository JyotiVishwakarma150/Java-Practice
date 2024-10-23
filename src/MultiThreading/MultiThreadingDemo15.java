package MultiThreading;
class MyThread10 extends Thread{
    Thread t;
    MyThread10(Thread t){
        this.t=t;
    }
    public void run(){
        try{
            t.join();
            for(int i=1;i<=5;i++){
                System.out.println("hii : "+i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
public class MultiThreadingDemo15 {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        MyThread10 mt = new MyThread10(t);
        mt.start();
        try{
            for(int i=1;i<=5;i++){
                System.out.println("hello : "+i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
