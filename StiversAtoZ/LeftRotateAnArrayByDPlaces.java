public class LeftRotateAnArrayByDPlaces {
    static int[] rotateArray(int[] arr, int d) {
        int n = arr.length;
        int k = d % n; // Handle cases where d > n

        // Step 1: Store first k elements in temp
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }

        // Step 2: Shift remaining elements to the left
        for (int i = k; i < n; i++) {
            arr[i - k] = arr[i];
        }

        // Step 3: Copy elements from temp back to arr
        for (int i = 0; i < k; i++) {
            arr[n - k + i] = temp[i];
        }

        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int d = 11;

        int[] rotatedArray = rotateArray(arr, d);

        System.out.println("Array after left rotation by " + d + " places: ");
        for (int num : rotatedArray) {
            System.out.print(num + " ");
        }
    }
}
