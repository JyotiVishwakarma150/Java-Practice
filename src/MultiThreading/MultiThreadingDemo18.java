package MultiThreading;
class MyThread13 extends Thread{
    public void run(){
        System.out.println("Is thread interrupted(1) : "+ Thread.interrupted());
        try{
            for(int i=1;i<=5;i++){
                System.out.println("Hii : "+i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Is Thread interrupted(2): "+Thread.interrupted());
    }
}
public class MultiThreadingDemo18 {
    public static void main(String[] args) {
        MyThread13 mt = new MyThread13();
        mt.start();
        mt.interrupt();
    }
}
