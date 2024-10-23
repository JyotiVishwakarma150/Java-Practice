package Challenge;
// concatenate and convert : take two strings , concatenate them , and convert the result to uppercase
 class StringManipulation {
 public static void main(String[] args) {
  String firstName = "Jyoti";
  String lastName = "Vishwakarma";
  //String fullName = firstName + " " + lastName;
  //System.out.println(fullName);
  String fullName = firstName.concat(" ").concat(lastName);
  System.out.println(fullName.toUpperCase());
 }
}
