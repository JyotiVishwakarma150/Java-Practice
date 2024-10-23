package Challenge;

 class Course {
  static int maxCapacity = 100;
  // instance variables....
  String courseName;
  int enrollments;
  String[] enrolledStudents;

  //constructor

   Course(String courseName){
this.courseName = courseName;
this.enrollments = 0;
this.enrolledStudents = new String[maxCapacity];
   }
   // Static method

  // instance methods
  static void setMaxCapacity(int maxCapacity){
    Course.maxCapacity = maxCapacity;
   }
   void enrollStudent(String studentName){
    enrolledStudents[enrollments] = studentName;
    enrollments++;
   }
   void unEnrollStudent(String studentName){
    System.out.println("Student removed");
    enrollments--;
   }
}
