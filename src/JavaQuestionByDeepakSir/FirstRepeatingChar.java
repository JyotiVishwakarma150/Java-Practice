package JavaQuestionByDeepakSir;

public class FirstRepeatingChar {
    public static void main(String[] args) {
        String str="this is dmeho";
        str= str.replaceAll("\\s","");
        int[] arr = new int[126];
        for(int i=0;i<str.length();i++){
            arr[str.charAt(i)]=arr[str.charAt(i)]+1;
        }
        int c=' ';
        for(int i=0;i<str.length();i++){
            if(arr[str.charAt(i)]>1){
                c=str.charAt(i);
                break;
            }
        }
        System.out.println("first repeated character is:  "+ c);
    }
}
