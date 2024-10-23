package MultiThreading;
class Abc2 extends Thread{
    public void run(){
        System.out.println("hii");
    }
}
public class MultithreadingCase2 {
    public static void main(String[] args) {
        Abc2 ob1 = new Abc2();
        ob1.start();
    }
}
