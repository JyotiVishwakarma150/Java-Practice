package MultiThreading;
class MyThread9 extends Thread{
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
public class MultiThreadingDemo14 {
    public static void main(String[] args) {
        MyThread9 mt = new MyThread9();
        mt.start();
        try{
            mt.join();
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
