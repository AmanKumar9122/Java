import java.util.ArrayList;
import java.util.List;

public class subSequence {
    // Function to print all subsequences
    public static void printSubsequences(int index, List<Integer> ds, int[] arr, int n) {
        // Base condition: if index reaches the end of the array
        if (index == n) {
            if (ds.isEmpty()) {
                System.out.print("()");
            } else {
                System.out.print(ds);
            }
            System.out.println(); // Move to the next line for the next subsequence
            return;
        }

        // Take or pick the current element into the subsequence
        ds.add(arr[index]);
        printSubsequences(index + 1, ds, arr, n);
        ds.remove(ds.size() - 1); // Backtrack

        // Not pick or skip the current element
        printSubsequences(index + 1, ds, arr, n);
    }

    public static void main(String[] args) {
        // Input array
        int[] arr = {3, 1, 2};
        int n = arr.length;

        // Data structure to store a subsequence
        List<Integer> ds = new ArrayList<>();

        // Function call to print all subsequences
        printSubsequences(0, ds, arr, n);
    }
}
