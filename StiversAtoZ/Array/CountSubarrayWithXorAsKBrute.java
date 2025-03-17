public class CountSubarrayWithXorAsKBrute {
    public int sum(int[] arr, int k) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int xor = 0;
            for (int j = i; j < arr.length; j++) {
                xor ^= arr[j];
                if (xor == k) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {4, 2, 2, 6, 4};
        int k = 6;
        CountSubarrayWithXorAsKBrute obj = new CountSubarrayWithXorAsKBrute();
        System.out.println("Number of subarrays with XOR = " + k + ": " + obj.sum(arr, k));
    }
}
