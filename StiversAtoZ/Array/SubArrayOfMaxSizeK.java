public class SubArrayOfMaxSizeK {
    public static int maxSum(int[] arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        int maxSum = sum;
        for (int i = k; i < arr.length; i++) {
            sum = sum - arr[i - k] + arr[i];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
    
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5};
            int k = 3;
            System.out.println("Maximum sum of subarray of size " + k + " is: " + maxSum(arr, k));
        }
        
    }
// Time Complexity: O(N)
// Space Complexity: O(1)
    
    
