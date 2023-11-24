public class defaultconstructor {
  String firstName;
  String lastName;
  int age;

  public defaultconstructor(){
      firstName = "Aman";
      lastName = "Kumar";
      age = 19;
  }
  
  public static void main(String args[]) {
      defaultconstructor myStudent = new defaultconstructor();
      System.out.println(myStudent.age);     
  }
}
