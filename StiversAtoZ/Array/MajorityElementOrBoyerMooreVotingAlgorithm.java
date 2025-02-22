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
