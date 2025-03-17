// public class SubArraySumEqualZero {
// //subarray with sum equal to zero
//     public static boolean subArrayExists(int[] arr) {
//         int n = arr.length;
//         for (int i = 0; i < n; i++) {
//             int sum = 0;
//             for (int j = i; j < n; j++) {
//                 sum += arr[j];
//                 if (sum == 0) {
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         int[] arr = {4, 2, -3, 1, 6};
//         System.out.println(subArrayExists(arr));
//     }
// }

//sliding window approach
import java.util.*;
public class SubArraySumEqualZero {
    public static boolean subArrayExists(int[] arr) {
        int n = arr.length;
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (arr[i] == 0 || sum == 0 || set.contains(sum)) {
                return true;
            }
            set.add(sum);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {4, 2, -3, 1, 6};
        System.out.println(subArrayExists(arr));
    }
}





