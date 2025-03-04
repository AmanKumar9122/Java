import java.util.*;
public class ThreesumBrute {
    public List<List<Integer>> threeSum(int[] arr) {
        int n = arr.length;
        Set<List<Integer>> st = new HashSet<>();
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
                        Collections.sort(temp); // Sort before adding to set
                        st.add(temp);
                    }
                }
            }
        }
        return new ArrayList<>(st);
    }

    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, -1, -4 };
        ThreesumBrute obj = new ThreesumBrute(); // Create an instance
        System.out.println(obj.threeSum(arr));  // Call method using the instance
    }
}
