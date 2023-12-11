// public class tailrecursion {
//     // This is an example of tail recursion.
// public static int factorial(int n) {
//     if (n == 0) {
//       return 1;
//     } else {
//       return factorial(n - 1) * n;
//     }
//   }
//   public static void main(String[] args) {
//     System.out.println(factorial(5));
//   }
    
// }

import java.util.Scanner;

/**
 * tailrecursion
 */
public class tailrecursion {
  public static void tail(int n){
    if(n == 0) return;
    System.out.println(n);
    tail(n-1);
  }
  public static void head(int n){
    if(n == 0) return;
    head(n-1);
    System.out.println(n);
  }
  
  public static void main(String[] args) {
    head(5);
    System.out.println("ok");
    tail(5);
  }
}