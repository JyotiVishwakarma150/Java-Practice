package Challenge;
// create a program to calculate the area of a triangle ..... Area of triangle = 1/2 * B * H
import java.util.Scanner;
class Challenge_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to area calculator \n");
        System.out.println("Please enter your base in cms : ");
        double base = input.nextDouble();
        System.out.println("Now, enter your perpendicular height in cms : ");
        double height = input.nextDouble();

        double area = 0.5*base*height;
        System.out.println("The area of your triangle is : " + area + "cms");
    }
}
