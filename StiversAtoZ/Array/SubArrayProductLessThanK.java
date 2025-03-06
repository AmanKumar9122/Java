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
