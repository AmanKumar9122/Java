public class SubArrayProductLessThanK {
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;
        int count = 0;
        int product = 1;
        int start = 0;
        for (int end = 0; end < nums.length; end++) {
            product *= nums[end];
            while (product >= k) {
                product /= nums[start];
                start++;
            }
            count += end - start + 1;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 6};
        int k = 100;
        System.out.println(numSubarrayProductLessThanK(nums, k));
    }
}

// Complexity Analysis:
// Time Complexity: O(n), where n is the size of the input array.
// Space Complexity: O(1). We are using only a constant amount of space.
