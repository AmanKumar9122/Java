public class NoOfSubSeq {
    public static int printSubsequencesWithSumK(int index, int[] arr, int n, int k, int currentSum) {
        // Base condition: if index reaches the end of the array
        if (index == n) {
            if (currentSum == k) {
                return 1;
            }
            return 0;
        }
        int l = printSubsequencesWithSumK(index + 1,arr, n, k, currentSum + arr[index]);
        int r = printSubsequencesWithSumK(index + 1,arr, n, k, currentSum);
        return l+r;
    }

    public static void main(String[] args) {
        // Input array
        int[] arr = {1, 2, 1};
        int n = arr.length;
        int k = 2; // Target sum


        // Function call to printing No.of subsequences with sum k
        System.out.println(printSubsequencesWithSumK(0, arr, n, k, 0));
    }
}
