//Boyer-Moore Voting Algorithm
public class MajorityElementOrBoyerMooreVotingAlgorithm {
        public int majorityElement(int[] nums) {
            int curr = nums[0];  
            int count = 1;  
    
            // Step 1: Find candidate
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] == curr) count++;
                else count--;
                if (count == 0) {
                    curr = nums[i];
                    count = 1;
                }
            }
    
            // Step 2: Verify candidate
            int countCurr = 0;
            for (int num : nums) {
                if (num == curr) countCurr++;
            }
            return countCurr > nums.length / 2 ? curr : -1;
        }
        public static void main(String[] args) {
            MajorityElementOrBoyerMooreVotingAlgorithm obj = new MajorityElementOrBoyerMooreVotingAlgorithm();
            int[] arr = {3,2,3};
            System.out.println(obj.majorityElement(arr));
        }   
}
// Time Complexity: O(N)
// Space Complexity: O(1)
// Output: 3
// Explanation: In the given array, the element 3 is the majority element as it appears more than n/2 times. Hence, the output is 3.
// Note: The Boyer-Moore Voting Algorithm is used to find the majority element in an array. The algorithm has two steps:
// Step 1: Find the candidate element. In this step, we iterate through the array and find the candidate element. We initialize the count as 1 and the candidate element as the first element of the array. For each element in the array, if the element is the same as the candidate element, we increment the count. If the count becomes 0, we update the candidate element to the current element and reset the count to 1.
// Step 2: Verify the candidate element. In this step, we verify if the candidate element is the majority element by counting the occurrences of the candidate element in the array. If the count of the candidate element is greater than n/2, where n is the length of the array, then the candidate element is the majority element. Otherwise, there is no majority element in the array.

