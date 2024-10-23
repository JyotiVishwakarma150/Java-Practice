package MultiThreading;
class MyThread00 extends Thread{
    public void run(){
        try{
            for(int i=1;i<=10;i++){
                System.out.println(i + " : "+Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
public class MultiThreadingDemo12 {
    public static void main(String[] args) {
        MyThread00 mt3 = new MyThread00();
        mt3.start();
        try{
            for(int i=1;i<=10;i++){
                System.out.println(i + " : "+ Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
