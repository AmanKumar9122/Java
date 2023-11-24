public class q9 {

    public static boolean isSorted(int[] arr, int n) {
        if (n == 1) {
            return true;
        }
        return arr[n - 1] >= arr[n - 2] && isSorted(arr, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2};
        boolean sorted = isSorted(arr, arr.length);
        System.out.println("Is the array sorted? " + sorted);
    }
}