package MultiThreading.threadgroupdemo;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyThreadTask2 implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread().getName());
        try{
            Thread.sleep(1000);
            System.out.println("----------------------------------");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
public class Test6 {
    public static void main(String[] args) {
        MyThreadTask2 mt = new MyThreadTask2();
        ExecutorService es = Executors.newFixedThreadPool(3);
        for(int i=1;i<=10;i++){
            es.submit(mt);
        }
        es.shutdown();
    }
}
