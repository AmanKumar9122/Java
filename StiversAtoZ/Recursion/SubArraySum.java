import java.util.*;

class Solution {
    public ArrayList<Integer> getAllSubarraySums(int[] arr) {
        ArrayList<Integer> subarraySums = new ArrayList<>();
        calculateSubarraySums(arr, 0, 0, subarraySums);
        return subarraySums;
    }

    private void calculateSubarraySums(int[] arr, int start, int currentSum, ArrayList<Integer> subarraySums) {
        // Base case: if start exceeds array length, stop recursion
        if (start == arr.length) {
            return;
        }

        // Recursive case: explore all subarrays starting from 'start'
        int sum = currentSum;
        for (int end = start; end < arr.length; end++) {
            sum += arr[end];
            subarraySums.add(sum);
        }

        // Move to the next starting index
        calculateSubarraySums(arr, start + 1, 0, subarraySums);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {1, 2, 3};
        ArrayList<Integer> result = solution.getAllSubarraySums(arr);
        System.out.println(result);
    }
}
// Output: [1, 3, 6, 2, 5, 3]