package MultiThreading;
class MyThread11 extends Thread{
    public void run(){
        try{
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
public class MultiThreadingDemo16 {
    public static void main(String[] args) {
        MyThread11 mt = new MyThread11();
        mt.start();
        mt.interrupt();
    }
}
