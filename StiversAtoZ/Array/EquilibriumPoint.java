import java.util.*;
class EquilibriumPoint {
    static int findEquilibrium(int[] arr) {
        int n = arr.length;

        int[] pref = new int[n];
        int[] suff = new int[n];

        pref[0] = arr[0];
        suff[n - 1] = arr[n - 1];

        for (int i = 1; i < n; i++) 
            pref[i] = pref[i - 1] + arr[i];

        for (int i = n - 2; i >= 0; i--) 
            suff[i] = suff[i + 1] + arr[i];

        for (int i = 0; i < n; i++) {
            if (pref[i] == suff[i]) 
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {-7, 1, 5, 2, -4, 3, 0};
        System.out.println(findEquilibrium(arr));
    }
}
// Complexity Analysis:
// Time Complexity: O(n), where n is the size of the input array.
// Space Complexity: O(n), where n is the size of the input array. We are using two extra arrays of size n to store the prefix and suffix sums.
