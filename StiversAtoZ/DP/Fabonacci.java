// Recursive Fabonacci series
// top-down approach 
// public class Fabonacci {
//     public static int fabonacci(int n) {
//         if (n <= 1) {
//             return n;
//         }
        
//         return fabonacci(n - 1) + fabonacci(n - 2);
//     }

//     public static void main(String[] args) {
//         int n = 9;
//         System.out.println(fabonacci(n));
//     }    
// }

// Output: 34

// Memorization Fabonacci series
// public class Fabonacci {
//     public int fab(int n,int []dp){
//         if(n<=1) return n;
//         if(dp[n]!=-1) return dp[n];
//         return dp[n]=fab(n-1,dp)+fab(n-2,dp);
//     }
//     public static void main(String[] args) {
//         int n = 9;
//         int[] dp = new int[n + 1];
//         for (int i = 0; i <= n; i++) {
//             dp[i] = -1;
//         }
//         Fabonacci fib = new Fabonacci();
//         System.out.println(fib.fab(n, dp));
//     }
// }

// Tabulation Fabonacci series
// Bottom-up Approach
// public class Fabonacci {
//     public static void main(String[] args) {
//         int n=9;
//         int dp[]= new int[n+1];
//         dp[0]=0;
//         dp[1]=1;
//         for(int i=2;i<=n;i++){
//             dp[i]=dp[i-1]+dp[i-2];
//         }
//         System.out.println(dp[n]);
//     }
// }

// Space Optimization
public class Fabonacci {
    public static void main(String[] args) {
        int n=9;
        int curr =0;
        int prev2 =0;
        int prev  =1;
        for(int i=2;i<=n;i++){
            curr=prev+prev2;
            prev2=prev;
            prev=curr;
        }
        System.out.println(curr);
    }
}


