package Challenge;
// create a program that determines if a given year is a leap year (considering conditional like divisible by 4 but not 100, unless also divisible by 400
import java.util.Scanner;
class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to New year calculator\n");
        System.out.println("Please enter the year that you want to check : ");
        int year = input.nextInt();
        if(year % 400 == 0 || (year % 4 ==0 && year % 100 != 0)){
            System.out.println("Your year is a leap year ");
        } else{
            System.out.println("your year is not a leap year ");
        }
    }
}
