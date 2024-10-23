package WhileLoop_Methods_Arrays;

public class Function {
    public static void main(String[] args) {
        printFirstPattern();
    }

    public static void printFirstPattern() {
        int rows = 0;
        while(rows<20){
            System.out.print(" *");
            int i=0;
            while(i<rows){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }
    }
}
