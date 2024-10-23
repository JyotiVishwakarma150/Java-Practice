package MultiThreading;
class Resource{

}
class MyThread18 extends Thread{
    Resource res1,res2;
    MyThread18(Resource res1,Resource res2){
        this.res1=res1;
        this.res2=res2;
    }
    public void run(){
        synchronized (res1){
            System.out.println("Thread 1 has allocated resource 1");
            try {
            Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e);
            }
            synchronized (res2){
                System.out.println("Thread 1 has allocated resource 2");
            }
        }
    }
}
class MyThread19 extends Thread{
    Resource res1,res2;
    MyThread19(Resource res1,Resource res2){
        this.res1=res1;
        this.res2=res2;
    }
    public void run(){
        synchronized (res2){
            System.out.println("Thread 1 has allocated resource 2");
            try {
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e);
            }
            synchronized (res1){
                System.out.println("Thread 1 has allocated resource 1");
            }
        }
    }
}
public class DeadlockDemo {
    public static void main(String[] args) {
        Resource res1 = new Resource();
        Resource res2 = new Resource();
        MyThread18 t1 = new MyThread18(res1,res2);
        t1.start();
        MyThread19 t2 = new MyThread19(res1,res2);
        t2.start();
    }
}
