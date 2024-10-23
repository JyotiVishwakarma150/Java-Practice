package Challenge;

import java.util.Scanner;

class StudentScore {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.println("Welcome to Student's Score \n");
  System.out.println("Please enter Student's Score : ");
  int score= input.nextInt();

  String category  = (score>80) ?"High": (score<50? "Low":"Moderate");
  System.out.println("Category is :" + category);

 }

}

