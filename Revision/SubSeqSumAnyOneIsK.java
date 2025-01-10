import java.util.ArrayList;
import java.util.List;

public class SubSeqSumAnyOneIsK {
    // Function to find any one subsequence with sum k
    public static boolean printSubsequencesWithSumK(int index, List<Integer> ds, int[] arr, int n, int k, int currentSum) {
        // Base condition: if index reaches the end of the array
        if (index == n) {
            if (currentSum == k) {
                System.out.println(ds); // Print the current subsequence
                return true; // Found a subsequence with sum k
            }
            return false; // No subsequence found
        }

        // Take or pick the current element into the subsequence
        ds.add(arr[index]);
        if (printSubsequencesWithSumK(index + 1, ds, arr, n, k, currentSum + arr[index])) {
            return true; // If found, propagate the result
        }
        ds.remove(ds.size() - 1); // Backtrack

        // Not pick or skip the current element
        if (printSubsequencesWithSumK(index + 1, ds, arr, n, k, currentSum)) {
            return true; // If found, propagate the result
        }

        return false; // No subsequence with sum k found
    }

    public static void main(String[] args) {
        // Input array
        int[] arr = {1, 2, 1};
        int n = arr.length;
        int k = 2; // Target sum

        // Data structure to store a subsequence
        List<Integer> ds = new ArrayList<>();

        // Function call to print any one subsequence with sum k
        if (!printSubsequencesWithSumK(0, ds, arr, n, k, 0)) {
            System.out.println("No subsequence with sum " + k + " found.");
        }
    }
}
