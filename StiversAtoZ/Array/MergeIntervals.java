import java.util.*;
public class MergeIntervals {
    public int[][] merge(int[][] arr) {
        int n = arr.length; // Get the number of intervals in the array
        // Step 1: Sort the intervals based on the start time (arr[i][0])
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        
        // Step 2: Create a list to store merged intervals
        List<int[]> ans = new ArrayList<>();
        
        // Step 3: Iterate through all intervals
        for (int i = 0; i < n; i++) { 
            int start = arr[i][0]; // Start of the current interval
            int end = arr[i][1];   // End of the current interval
            
            // Step 4: Skip intervals that are already merged
            if (!ans.isEmpty() && end <= ans.get(ans.size() - 1)[1]) {
                continue; // Skip as it's already merged in the previous iteration
            }
            
            // Step 5: Check for overlapping intervals and merge them
            for (int j = i + 1; j < n; j++) {
                if (arr[j][0] <= end) { 
                    // If the next interval starts before the current one ends, merge them
                    end = Math.max(end, arr[j][1]); // Update the end time
                } else {
                    // No more merging is possible, break the loop
                    break;
                }
            }
            
            // Step 6: Add the merged interval to the answer list
            ans.add(new int[]{start, end});
        }
        
        // Step 7: Convert the list of merged intervals into a 2D array and return it
        return ans.toArray(new int[ans.size()][]);
    }
    
    public static void main(String[] args) {
        MergeIntervals solution = new MergeIntervals();
        
        // Input: List of intervals
        int[][] intervals = {
            {1, 3}, {2, 6}, {8, 10}, {15, 18}
        };
        
        // Call the merge function
        int[][] mergedIntervals = solution.merge(intervals);
        
        // Print the result
        System.out.println("Merged Intervals:");
        for (int[] interval : mergedIntervals) {
            System.out.println(Arrays.toString(interval));
        }
    }
}    
// Complexity Analysis:
// Time Complexity: O(nlogn), where n is the number of intervals in the input array. The time complexity is dominated by the sorting step, which takes O(nlogn) time.
// Space Complexity: O(n), where n is the number of intervals in the input array. The space complexity is O(n) because we are using a list to store the merged intervals. The list can contain at most n elements.
