import java.util.ArrayList;
import java.util.List;

public class SubSeqSumIsK {
    // Function to print all subsequences with sum k
    public static void printSubsequencesWithSumK(int index, List<Integer> ds, int[] arr, int n, int k, int currentSum) {
        // Base condition: if index reaches the end of the array
        if (index == n) {
            if (currentSum == k) {
                System.out.println(ds); // Print the current subsequence
            }
            return;
        }

        // Take or pick the current element into the subsequence
        ds.add(arr[index]);
        printSubsequencesWithSumK(index + 1, ds, arr, n, k, currentSum + arr[index]);
        ds.remove(ds.size() - 1); // Backtrack

        // Not pick or skip the current element
        printSubsequencesWithSumK(index + 1, ds, arr, n, k, currentSum);
    }

    public static void main(String[] args) {
        // Input array
        int[] arr = {1, 2, 1};
        int n = arr.length;
        int k = 2; // Target sum

        // Data structure to store a subsequence
        List<Integer> ds = new ArrayList<>();

        // Function call to print subsequences with sum k
        printSubsequencesWithSumK(0, ds, arr, n, k, 0);
    }
}
