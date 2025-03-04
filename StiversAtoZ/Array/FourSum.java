import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public List<List<Integer>> fourSum(int[] arr, int target) {
        int n = arr.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        if (arr == null || n < 4) return ans;
        for (int x = 0; x < n-3; x++) {
            if (x != 0 && arr[x] == arr[x - 1])
                continue;
            for (int i = x + 1; i < n-2; i++) {
                // remove duplicates:
                if (i != x+1 && arr[i] == arr[i - 1])
                    continue;
                // moving 2 pointers:
                int j = i + 1;
                int k = n - 1;
                while (j < k) {
                    long sum = (long)arr[x] + arr[i] + arr[j] + arr[k];
                    if (sum < target) {
                        j++;
                    } else if (sum > target) {
                        k--;
                    } else {
                        List<Integer> temp = Arrays.asList(arr[x], arr[i], arr[j], arr[k]);
                        ans.add(temp);
                        j++;
                        k--;
                        // skip the duplicates:
                        while (j < k && arr[j] == arr[j - 1])
                            j++;
                        while (j < k && arr[k] == arr[k + 1])
                            k--;
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 0, -1, 0, -2, 2 };
        int target = 0;
        FourSum obj = new FourSum(); // Create an instance
        System.out.println(obj.fourSum(arr, target));  // Call method using the instance
    }
}
// Complexity Analysis:
// Time Complexity: O(n^3), where n is the size of the input array.
// Space Complexity: O(1). The space complexity is O(1) because we are using a constant amount of extra space for the loop variables.