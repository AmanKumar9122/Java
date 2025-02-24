public class LongestSubsequence {
    public static int longestSubsequence(int n, int arr[]) {
        int ans = 1;
        int dp[] = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (Math.abs(arr[i] - arr[j]) == 1) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 7;
        int arr[] = {10, 9, 4, 5, 4, 8, 6};
        System.out.println(longestSubsequence(n, arr));
    }
    
}
