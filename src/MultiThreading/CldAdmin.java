package MultiThreading;
class TakeAdmin extends Thread{
    public void run(){
        try{
            System.out.println("Admisn starts ");
            Thread.sleep(5000);
            System.out.println("you have take the admisn successfully");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
class DepositFee extends Thread{
    public void run(){
        try{
            System.out.println("Depositing fee");
            Thread.sleep(1000);
            System.out.println("You have deposit the fee successfully");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
class TakeRollno extends Thread{
    public void run(){
        try{
            System.out.println("Take roll no");
            Thread.sleep(1000);
            System.out.println("Now you can sit in exams...!!");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
public class CldAdmin {
    public static void main(String[] args) throws InterruptedException{
        TakeAdmin t1 = new TakeAdmin();
        t1.start();
        t1.join();
        DepositFee t2 = new DepositFee();
        t2.start();
        t2.join();
        TakeRollno t3 = new TakeRollno();
        t2.start();
        t3.join();
    }
}
