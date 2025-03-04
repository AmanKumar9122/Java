import java.util.*;
public class ThreesumBetter {
    public List<List<Integer>> threeSum(int[] arr) {
        int n = arr.length;
        Set<List<Integer>> st = new HashSet<>();

        for (int i = 0; i < n; i++) {
            Set<Integer> hashset = new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                //Calculate the 3rd element:
                int third = -(arr[i] + arr[j]);

                //Find the element in the set:
                if (hashset.contains(third)) {
                    List<Integer> temp = Arrays.asList(arr[i], arr[j], third);
                    temp.sort(null);
                    st.add(temp);
                }
                hashset.add(arr[j]);
            }
        }

        // store the set elements in the answer:
        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;   
    }
    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, -1, -4 };
        ThreesumBetter obj = new ThreesumBetter(); // Create an instance
        System.out.println(obj.threeSum(arr));  // Call method using the instance
    }
}

// Complexity Analysis:
// Time Complexity: O(n^2), where n is the size of the input array.
// Space Complexity: O(n), where n is the size of the input array. The space complexity is O(n) because we are using a hashset to store the elements of the input array. The hashset can contain at most n elements.