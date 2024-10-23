package MultiThreading;
class BookTrainSeat{
//    int total_seats=10;
//
//    synchronized public void bookSeat(int seats,String name){
//        if(total_seats>=seats){
//            System.out.println(name+" booked "+seats+" seats successfully");
//            total_seats = total_seats-seats;
//            System.out.println("Total seats left : "+ total_seats);
//        }
//        else{
//            System.err.println(name+ " Sorry...!! seats not booked");
//            System.err.println("Total seats left : "+ total_seats);
//        }
//    }
//}
//class MyThread15 extends Thread{
//    BookTrainSeat bts;
//    int seats;
//    public MyThread15(BookTrainSeat bts,int seats){
//        this.bts=bts;
//        this.seats=seats;
//    }
//    public void run(){
//        bts.bookSeat(seats,Thread.currentThread().getName());
//    }
//}
//public class TrainReservation {
//    public static void main(String[] args) {
//        BookTrainSeat bts = new BookTrainSeat();
//        MyThread15 deepak = new MyThread15(bts,5);
//        deepak.setName("Deepak");
//        deepak.start();
//        MyThread15 amit= new MyThread15(bts ,3);
//        amit.setName("amit");
//        amit.start();
//        MyThread15 rahul= new MyThread15(bts ,4);
//        rahul.setName("rahul");
//        rahul.start();
//
//
//    }
//}
int total_seats=10;
void bookSeat(int seats,String name){
try{
    for(int i=1;i<=10;i++){
        System.out.println(Thread.currentThread().getName()+ " : "+ i);
        Thread.sleep(1000);
    }
}
catch(Exception e){
    System.out.println(e);
}
synchronized(this){
    if(total_seats>=seats){
        System.out.println(name+ " booked "+ seats+" Seats successfully");
        total_seats= total_seats-seats;
        System.out.println("Total seats left : "+total_seats);
    }
    else{
        System.out.println(name+" sorry...!! seats not left");
        System.out.println("Total seats left : "+total_seats);
    }
}
}
}
class MyThread15 extends Thread{
    BookTrainSeat bts;
    int seats;
    public MyThread15(BookTrainSeat bts,int seats){
        this.bts= bts;
        this.seats=seats;
    }
    public void run(){
        bts.bookSeat(seats ,Thread.currentThread().getName());
    }
}
public class TrainReservation{
    public static void main(String[] args) {
        BookTrainSeat bts = new BookTrainSeat();
        MyThread15 deepak = new MyThread15(bts,5);
        deepak.setName("Deepak");
        deepak.start();
        MyThread15 amit= new MyThread15(bts ,3);
        amit.setName("amit");
        amit.start();
        MyThread15 rahul= new MyThread15(bts ,4);
        rahul.setName("rahul");
        rahul.start();
    }
}