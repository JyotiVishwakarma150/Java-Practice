package MultiThreading;

public class Test00 {
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            public void run(){
                for(int i=1;i<=10;i++){
                    System.out.println(" hii  : "+ i);
                }
            }
        };
        t1.start();
        Thread t2 = new Thread(){
            public void run(){
                for(int i=1;i<=10;i++){
                    System.out.println("hello  : "+i);
                }
            }
        };
        t2.start();
    }
}
