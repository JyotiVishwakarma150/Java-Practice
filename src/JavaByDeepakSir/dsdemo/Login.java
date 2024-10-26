package JavaByDeepakSir.dsdemo;
import  java.util.Scanner;
public class Login {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter email id");
        String email=s.next();
        System.out.println("Enter password");
        String pass = s.next();
        if(email.equals("admin@gmail.com")&&pass.equals("admin123")){
            String name= "Deepak";
            String dob="01-01-1990";
            String city="Chandigarh";
            String phno ="0987654321";
            int age = 20;
            Profile p = new Profile(name,dob,age,phno,city);
            p.Welcome();
        }
        else{
            System.out.println("invalid login");
        }
    }
}
