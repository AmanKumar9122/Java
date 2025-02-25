public class BubbleSort {
    public void bub(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) { // Loop through each element
            for (int j = 0; j < n - i - 1; j++) { // Compare adjacent elements
                if (arr[j] > arr[j + 1]) { // Swap if needed
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {10, 1, 2, 8, 6, 7, 5};
        BubbleSort obj = new BubbleSort();
        obj.bub(arr);
        
        System.out.println("Sorted array in descending order:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
