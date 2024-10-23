package MultiThreading;

public class MultiThreadingDemo7 {
    public void run(){
        System.out.println("hii");
        System.out.println("old child Thread name : "+ Thread.currentThread().getName());
        Thread.currentThread().setName("my_child_thread");
        System.out.println("new child thread name : "+ Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("Old child thread name :"+Thread.currentThread().getName());
        Thread.currentThread().setName("my_main_thread");
        System.out.println("new main Thread name : "+Thread.currentThread().getName());
        MultiThreadingDemo7 t3 = new MultiThreadingDemo7();
        t3.run();
    }
}
