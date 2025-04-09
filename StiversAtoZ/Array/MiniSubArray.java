// Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.
// Example 1:
// Input: target = 7, nums = [2,3,1,2,4,3]
// Output: 2
// Explanation: The subarray [4,3] has the minimal length under the problem constraint.
public class MiniSubArray {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int minLength = Integer.MAX_VALUE;
        int windowSum = 0;
        int start = 0;
        
        for (int end = 0; end < n; end++) {
            windowSum += nums[end];
            
            while (windowSum >= target) {
                minLength = Math.min(minLength, end - start + 1);
                windowSum -= nums[start];
                start++;
            }
        }
        
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
    public static void main(String[] args) {
        MiniSubArray miniSubArray = new MiniSubArray();
        //int target = 7;
        //int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 4;
        int[] nums = {1, 4, 4};
        int result = miniSubArray.minSubArrayLen(target, nums);
        System.out.println(result);
    }
}