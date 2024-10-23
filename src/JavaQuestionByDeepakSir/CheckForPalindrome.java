package JavaQuestionByDeepakSir;

public class CheckForPalindrome {
//    public static void main(String[] args) {
//        String str="deepak";
//        //int leng = str.length();
//        String rev =" ";
//        int leng = str.length();
//
//        for(int i=leng-1;i>=0;i--){
//            rev = rev + str.charAt(i);
//        }
//        if(str.equals(rev)){
//            System.out.println("String is palindrome");
//        }
//        else{
//            System.out.println("String is not palindrome");
//        }
//    }
public static void main(String[] args) {
    String name="abcba";
    int leng = name.length();
    String rev="";
    for(int i=leng-1;i>=0;i--){
        rev = rev+ name.charAt(i);
    }
   // System.out.println(rev);
    if(name.equals(rev)){
         System.out.println("String is palindrome");
    }
      else{
            System.out.println("String is not palindrome");
        }
}
}
