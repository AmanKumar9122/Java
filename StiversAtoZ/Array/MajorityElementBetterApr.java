import java.util.HashMap;
import java.util.Map;

public class MajorityElementBetterApr {
    public int majorityElement(int[] v) {
        int n = v.length;
        //declaring a map:
        HashMap<Integer, Integer> mpp = new HashMap<>();
        //storing the elements with its occurrence:
        for (int i = 0; i < n; i++) {
            int value = mpp.getOrDefault(v[i], 0);
            mpp.put(v[i], value + 1);
        }
        //searching for the majority element:
        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            if (it.getValue() > (n / 2)) {
                return it.getKey();
            }
        }
        return -1; 
    }
    public static void main(String[] args) {
        MajorityElementBetterApr obj = new MajorityElementBetterApr();
        int[] arr = {3,2,3};
        System.out.println(obj.majorityElement(arr));
    }
}
// Time Complexity: O(N)
// Space Complexity: O(N)
