public class SumOfGoodNo {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 3, 2, 4, 5};
        int k = 1;
        int result = solution.sumOfGoodNumbers(nums, k);
        System.out.println("Sum of good numbers: " + result);
    }
}

class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int totalSum = 0; 
        int n = nums.length; 
        
        for (int i = 0; i < n; i++) {
            boolean isGood = true; 
            
            if (i - k >= 0) { 
                if (nums[i] <= nums[i - k]) { 
                    isGood = false; 
                }
            }
            if (i + k < n) { 
                if (nums[i] <= nums[i + k]) { 
                    isGood = false; 
                }
            }
            if (isGood) {
                totalSum += nums[i];
            }
        }
        return totalSum; 
    }
}