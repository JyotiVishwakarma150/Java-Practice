package MultiThreading;
//class PlayVideo1{
//    void executeVideo(){
//        for(int i=1;i<=100;i++){
//            System.out.println("video is playing");
//        }
//    }
//}
//class PlaySound1{
//    void executeSound(){
//        for(int i=1;i<=100;i++){
//            System.out.println("Sound is executing");
//        }
//    }
//}
class PlaySound1 extends Thread{
    public void run(){
        for(int i=1;i<=100;i++){
            System.out.println("Sound1 is executing");
        }
    }
}
class PlaySound2 extends Thread{
    public void run(){
        for(int i=1;i<=100;i++){
            System.out.println("Sound2 is executing");
        }
    }
}
public class Vlc2 {
    public static void main(String[] args) {
//        PlayVideo1 pv=new PlayVideo1();
//        pv.executeVideo();
//        PlaySound1 ps = new PlaySound1();
//        ps.executeSound();
        PlaySound1 ps =new PlaySound1();
        ps.start();
        PlaySound2 pv = new PlaySound2();
        pv.start();

    }
}
