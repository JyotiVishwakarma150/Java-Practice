package If_Else;
import java.lang.*;
public class LearningIf {
    public static void main(String[] args) {
        boolean isMale = false;
        String name = "Bob";
        System.out.println("before if");
        if (isMale) {
            System.out.println("Mr. " + name);
        } else {
            System.out.println("Ms. " + name);
        }
        System.out.println("after if");

        boolean isSeniorCitizen = true;
        boolean isAnAdult = true;
        if(isSeniorCitizen) {
            System.out.println("Hello senior citizen");
        } else{
            if(isAnAdult) {
                System.out.println("Hello adult");
            } else{
                System.out.println("hello child");
            }
        }
    }
}
