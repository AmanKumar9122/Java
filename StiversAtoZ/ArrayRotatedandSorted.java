public class ArrayRotatedandSorted {
    public static boolean check(int[] arr, int n) {
        int count = 0;
        
        // Single-element array is always rotated and sorted
        if (n == 1) {
            return true;
        }
        
        // Count breaks where arr[i] > arr[i+1]
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                count++;
            }
        }
        
        // Check the last element with the first (rotation)
        if (arr[n - 1] > arr[0]) {
            count++;
        }
        
        // If there is more than 1 break, it's not rotated and sorted
        return count <= 1;
    }

    public static void main(String[] args) {
        int arr[] = {3, 4, 5, 1, 2};
        int n = arr.length;

        if (check(arr, n)) {
            System.out.println("Array is rotated and sorted");
        } else {
            System.out.println("Array is not rotated and sorted");
        }
    }
}
