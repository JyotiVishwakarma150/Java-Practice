package MultiThreading;
class BookTicket{
    static int total_seats=10;
    static synchronized  void bookTicket(int seats){
        if(total_seats >= seats){
            System.out.println("success");
            total_seats = total_seats-seats;
            System.out.println("Seats left : "+ total_seats);
        }
        else{
            System.out.println("fail");
        }
    }
}
class MyThread16 extends  Thread{
    BookTicket bt;
    int seats;
    MyThread16(BookTicket bt,int seats){
        this.bt=bt;
        this.seats=seats;
    }
    public void run(){
        bt.bookTicket(seats);
    }
}
class MyThread17 extends Thread{
    BookTicket bt;
    int seats;
    MyThread17(BookTicket bt,int seats){
        this.bt=bt;
        this.seats=seats;
    }
    public void run(){
        bt.bookTicket(seats);
    }
}
public class TrainBooking {
    public static void main(String[] args) {
       BookTicket bt1 = new BookTicket();
       MyThread16 t1 = new MyThread16(bt1,7);
       t1.start();
       MyThread16 t2 = new MyThread16(bt1 ,3);
       t2.start();
       //------------------------------------------------------
        BookTicket bt2 =new BookTicket();
       MyThread17 t3 = new MyThread17(bt2,2);
       t3.start();
       MyThread17 t4 = new MyThread17(bt2 ,1);
        t4.start();
    }
}
