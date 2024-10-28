import java.util.Arrays;

public class NextGreaterElementBruteForce {
    public static int[] findNextGreaterElements(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = -1;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    result[i] = arr[j];
                    break;
                }
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10, 8};
        int[] nextGreater = findNextGreaterElements(arr);

        System.out.println("Next Greater Elements: " + Arrays.toString(nextGreater));
    }
}
