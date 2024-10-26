package JavaByDeepakSir.dsdemo;

public class Profile {
    String name;
    String dob;
    int age;
    String phno;
    String city;
    Profile(String name,String dob ,int age,String phno,String city ){
        this.name =name;
        this.dob=dob;
        this.age=age;
        this.phno=phno;
        this.city=city;
    }
    void Welcome(){
        System.out.println("Welcome : "+name);
        System.out.println("Dob : "+dob);
        System.out.println("Age : "+age);
        System.out.println("Phone no : "+phno);
        System.out.println("city : "+city);
    }
}
