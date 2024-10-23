package MultiThreading;
class Abc1 extends Thread{
    public void run(){
        System.out.println("hiiiii");
    }
}
public class MultiThreadingCase1 {
    public static void main(String[] args) {
        Abc1 ob1 = new Abc1();
        ob1.start();
    }
}
