public class KadanesAlogrithm {
        public int maxSubArray(int[] nums) {
            int sum = 0;
            int max = Integer.MIN_VALUE;
            for(int i=0;i<nums.length;i++){
                sum+=nums[i];
                if(sum>max){
                    max=sum;
                }
                if(sum<0){
                    sum=0;
                }
            }
            return max;
        }
    public static void main(String[] args) {
        KadanesAlogrithm obj = new KadanesAlogrithm();
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(obj.maxSubArray(arr));
    }
}
// Time Complexity: O(N)
// Space Complexity: O(1)
// Output: 6
// Explanation: The maximum sum subarray is [4,-1,2,1] with a sum of 6.
// Note: The Kadane's Algorithm is used to find the maximum sum subarray in an array. The algorithm maintains two variables, sum and max, to keep track of the current sum and the maximum sum subarray found so far. It iterates through the array and updates the sum by adding the current element. If the sum becomes greater than the max, the max is updated. If the sum becomes negative, it is reset to 0. The final value of max is the maximum sum subarray.
// The Kadane's Algorithm is an efficient approach to solve the maximum subarray problem in linear time complexity. It is widely used in various applications, such as image processing, data analysis, and machine learning.
// The Kadane's Algorithm is a dynamic programming technique that avoids recomputing subproblems by maintaining the current sum and the maximum sum subarray found so far. It is a simple and elegant solution to the maximum subarray problem, which has applications in various domains, including computer science, finance, and engineering.
// The Kadane's Algorithm is a classic example of dynamic programming, where the solution to a larger problem is built upon the solutions to smaller subproblems. By maintaining the current sum and the maximum sum subarray found so far, the algorithm efficiently computes the maximum sum subarray in linear time complexity.


// printing that subarray
// public class KadanesAlogrithm {
//         public int maxSubArray(int[] nums) {
//             int sum = 0;
//             int max = Integer.MIN_VALUE;
//             int start = 0;
//             int end = 0;
//             int s = 0;
//             for(int i=0;i<nums.length;i++){
//                 sum+=nums[i];
//                 if(sum>max){
//                     max=sum;
//                     start = s;
//                     end = i;
//                 }
//                 if(sum<0){
//                     sum=0;
//                     s=i+1;
//                 }
//             }
//             System.out.println("Start Index: "+start);
//             System.out.println("End Index: "+end);
//             return max;
//         }
//     public static void main(String[] args) {
//         KadanesAlogrithm obj = new KadanesAlogrithm();
//         int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
//         System.out.println(obj.maxSubArray(arr));
//     }
// }
// Time Complexity: O(N)
// Space Complexity: O(1)
// Output: 6
// Start Index: 3
// End Index: 6
// Explanation: The maximum sum subarray is [4,-1,2,1] with a sum of 6. The start index of the subarray is 3 and the end index is 6.