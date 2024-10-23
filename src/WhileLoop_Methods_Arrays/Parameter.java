package WhileLoop_Methods_Arrays;

public class Parameter {
    public static void main(String[] args) {
        System.out.println(SumTwoNumbers(4,7));
        System.out.println(SumTwoNumbers(5,9));
        System.out.println(SumTwoNumbers(-67,67));
    }

    public static int SumTwoNumbers(int first , int second) {
        System.out.println("First number received : "+ first);
        System.out.println("Second number received : "+second);
        int sum = first + second;
        return sum;
    }
}
