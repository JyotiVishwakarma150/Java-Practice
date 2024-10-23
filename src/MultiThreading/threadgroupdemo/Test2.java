package MultiThreading.threadgroupdemo;

public class Test2 {
    public static void main(String[] args) {
        ThreadGroup tg = new ThreadGroup("main-sub-thread-group");
        Thread t1 = new Thread(tg,"deepak thread");
        Thread t2 = new Thread(tg,"amit thread");
        System.out.println("Current thread - group name : "+tg.getName());
        System.out.println("Parent thread - group name : "+tg.getParent().getName());
        t1.start();
        t2.start();
        System.out.println(tg.activeCount() );
        System.out.println("Old priority of thread-group : "+tg.getMaxPriority());
        tg.setMaxPriority(7);
        System.out.println("New priority of thread-group : "+ tg.getMaxPriority());
        tg.list();
    }
}
