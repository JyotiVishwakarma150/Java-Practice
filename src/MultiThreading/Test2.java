package MultiThreading;

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("child thread : "+ i);
        }
    }
}
public class Test2{
    public static void main(String[] args) {
        MyThread t1= new MyThread();
        t1.start();
        for(int i=1;i<=100;i++){
            System.out.println("main thread : "+i);
        }
    }
}

