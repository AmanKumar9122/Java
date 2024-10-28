// public class function {
//     // Recursive function
//     public void fun(int n) {
//         if (n == 0) {
//             System.out.println("Reached base case: n = 0");
//             return;
//         } else {
//             System.out.println("Current value of n: " + n);
//             fun(n - 1);
//         }
//     }

//     public static void main(String[] args) {
//         function obj = new function();
//         obj.fun(3);
//     }
// }


public class function {
    public int fun(int n) {
        if (n == 0) {
            return 0;
        } else {
            System.out.println("Current value of n: " + n);
            return fun(n - 1);
        }
    }

    public static void main(String[] args) {
        function obj = new function();
        int result = obj.fun(3);
        System.out.println("Result of fun(3): " + result);
    }
}


