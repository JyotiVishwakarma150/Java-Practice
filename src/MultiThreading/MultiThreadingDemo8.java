package MultiThreading;
import java.util.*;
public class MultiThreadingDemo8 {
    public void run(){
        System.out.println("hii");
        System.out.println("child thread : "+Thread.currentThread().isDaemon());
    }

    public static void main(String[] args) {
        MultiThreadingDemo8 t4 = new MultiThreadingDemo8();
//     t4.setDaemon(true);
//     t4.start();
        System.out.println("Main thread : "+Thread.currentThread().isDaemon());
    }
}
//o/p= Main thread : false
//hi
//child thread :true