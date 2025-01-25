public class SecondLargestArray {
    public static void second(int arr[], int n) {
        if (n < 2) {
            System.out.println("Array should have at least 2 elements");
            return;
        }
        
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int second_smallest = Integer.MAX_VALUE;

        // Find largest and smallest
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                second_largest = largest;
                largest = arr[i];
            } else if (arr[i] > second_largest && arr[i] != largest) {
                second_largest = arr[i];
            }

            if (arr[i] < smallest) {
                second_smallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < second_smallest && arr[i] != smallest) {
                second_smallest = arr[i];
            }
        }

        if (second_largest == Integer.MIN_VALUE) {
            System.out.println("No second largest element");
        } else {
            System.out.println("Second Largest: " + second_largest);
        }

        if (second_smallest == Integer.MAX_VALUE) {
            System.out.println("No second smallest element");
        } else {
            System.out.println("Second Smallest: " + second_smallest);
        }
    }

    public static void main(String[] args) {
        int arr[] = {12, 35, 1, 10, 34, 1};
        int n = arr.length;
        second(arr, n);
    }
}
