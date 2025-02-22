import java.util.ArrayList;
import java.util.Collections;

public class ArrayLeaders {
    // Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int n, int arr[]) {
        // Your code here
        ArrayList<Integer> ans = new ArrayList<>();
        int max = arr[n - 1];
        ans.add(arr[n - 1]); // The last element is always a leader
        
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= max) {  // Changed from `>` to `>=`
                ans.add(arr[i]);
                max = arr[i];
            }
        }
        
        // Reverse the ArrayList to maintain the original order of leaders
        Collections.reverse(ans);
        
        return ans;
    }
    public static void main(String[] args) {
        int n = 6;
        int arr[] = {16, 17, 4, 3, 5, 2};
        ArrayList<Integer> res = leaders(n, arr);
        for (int i = 0; i < res.size(); i++) {
            System.out.print(res.get(i) + " ");
        }
    }
}
// Time Complexity: O(N)
// Space Complexity: O(N)
