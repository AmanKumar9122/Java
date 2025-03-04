import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MajorityElementII {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        int req = n / 3;
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                if (count > req) {
                    result.add(nums[i - 1]);
                }
                count = 1; // Reset count for new number
            }
        }

        // Check last element
        if (count > req) {
            result.add(nums[n - 1]);
        }

        return result;
    }
    public static void main(String[] args) {
        MajorityElementII obj = new MajorityElementII();
        int[] nums = { 3, 2, 3 };
        System.out.println(obj.majorityElement(nums));
    }
}
