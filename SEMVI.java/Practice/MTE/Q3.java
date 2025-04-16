// Split Array into Equal Sum Prefix and Suffix: Check if an array 
// can be split into two parts such that the sum of the prefix equals 
// the sum of the suffix. 
public class Q3 {
    public boolean canBeSplit(int[] arr) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        int prefixSum = 0;
        for (int i = 0; i < arr.length - 1; i++) { // exclude full array
            prefixSum += arr[i];
            int suffixSum = totalSum - prefixSum;
            if (prefixSum == suffixSum) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Q3 obj = new Q3();
        int[] arr1 = {1, 2, 3, 3};   // true: 1+2 = 3
        int[] arr2 = {1, 1, 1, 2, 1}; // false
        System.out.println(obj.canBeSplit(arr1)); // true
        System.out.println(obj.canBeSplit(arr2)); // false
    }
}
