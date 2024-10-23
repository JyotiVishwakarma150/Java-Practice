package MultiThreading;
import  java.util.concurrent.locks.ReentrantLock;
class BookTicket0{
    ReentrantLock re = new ReentrantLock();
    int total_seats=10;
    void bookTicket(int seats){
        re.lock();
        if(total_seats>=seats){
            System.out.println("success");
            total_seats=total_seats-seats;
            System.out.println("Seats left : "+total_seats);
        }
        else{
            System.err.println("fail");
        }
        try{
            System.out.println("--------------------------------");
            Thread.sleep(500);
        }
        catch(Exception e){
            System.out.println(e);
        }
        m1();
    }
    void m1(){
        System.out.println("hiiiiiiii");
        re.unlock();
    }
}
class MyThread20 extends Thread{
    BookTicket bt;
    int seats;
    MyThread20(BookTicket bt,int seats){
        this.bt=bt;
        this.seats=seats;
    }
    public void run(){
        bt.bookTicket(seats);
    }
}
class MyThread21 extends Thread{
    BookTicket bt;
    int seats;
    MyThread21(BookTicket bt,int seats){
        this.bt=bt;
        this.seats=seats;
    }
    public void run(){
        bt.bookTicket(seats);
    }
}
public class Test0000 {
    public static void main(String[] args) {
        BookTicket bt1 = new BookTicket();

        MyThread20 t1 = new MyThread20(bt1,4);
        t1.start();
        MyThread20 t2 = new MyThread20(bt1,7);
        t2.start();
    }
}
