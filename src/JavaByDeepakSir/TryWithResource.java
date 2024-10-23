package JavaByDeepakSir;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;

public class TryWithResource {
    public static void main(String[] args) {
//        try{
//            Class.forName("");
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }
//        try(
//            Connection con = DriverManager.getConnection("","","");
//        )
//        {
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }
        try(
                FileInputStream fis = new FileInputStream("");
                )
        {
            fis.read();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
