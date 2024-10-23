package MultiThreading;
class MyThread12 extends Thread{
    public void run(){
        System.out.println("Is thread interrupted (1) : " + Thread.currentThread().isInterrupted());
        try{
            for(int i =1;i<=5;i++){
                System.out.println("hii : "+i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Is Thread interrupted (2) : "+Thread.currentThread().isInterrupted());
    }
}
public class MultiThreadingDemo17 {
    public static void main(String[] args) {
        MyThread12 mt = new MyThread12();
        mt.start();
        mt.interrupt();
    }
}
