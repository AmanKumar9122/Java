// // Package P1
// package p1;

// public class Student {

//     // Private method
//     private void privateMethod() {
//         System.out.println("This is a private method.");
//     }

//     // Protected method
//     protected void protectedMethod() {
//         System.out.println("This is a protected method.");
//     }

//     // Default method
//     void defaultMethod() {
//         System.out.println("This is a default method.");
//     }
// }

//..................................................................................................

// // Package P2
// package p2;

// import p1.Student;

// public class BTech {

//     public static void main(String[] args) {
//         Student student = new Student();
//         //student.privateMethod(); // Cannot access private method from another package
//         student.protectedMethod(); // Can access protected method from another package
//         student.defaultMethod(); // Can access default method from another package
//     }
// }