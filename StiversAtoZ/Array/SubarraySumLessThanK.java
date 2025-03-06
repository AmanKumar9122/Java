// public class SubarraySumLessThanK {
//     public static int subarraySum(int[] nums, int k) {
//         int count = 0;
//         for (int start = 0; start < nums.length; start++) {
//             int sum = 0;
//             for (int end = start; end < nums.length; end++) {
//                 sum += nums[end];
//                 if (sum < k) {
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }
//     public static void main(String[] args) {
//         int[] nums = {1, 2, 3};
//         int k = 6;
//         System.out.println(subarraySum(nums, k));
//     } 
// }

// sliding window approach
public class SubarraySumLessThanK {
    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        int start = 0;
        for (int end = 0; end < nums.length; end++) {
            sum += nums[end];
            while (sum >= k) {
                sum -= nums[start];
                start++;
            }
            count += end - start + 1;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int k = 6;
        System.out.println(subarraySum(nums, k));
    } 
}

