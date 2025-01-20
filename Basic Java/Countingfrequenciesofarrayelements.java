import java.util.*;
class Countingfrequenciesofarrayelements {
    // Function to count the frequency of all elements from 1 to N in the array.
    public List<Integer> frequencyCount(int[] arr) {
        int N = arr.length;

        // Step 1: Reduce out-of-range values to 0
        for (int i = 0; i < N; i++) {
            if (arr[i] > N || arr[i] <= 0) {
                arr[i] = 0;
            }
        }

        // Step 2: Use indices to track frequencies
        for (int i = 0; i < N; i++) {
            int element = arr[i] % (N + 1); // Use modulo to keep original values
            if (element > 0) {
                arr[element - 1] += (N + 1);
            }
        }

        // Step 3: Extract frequencies
        List<Integer> frequencies = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            frequencies.add(arr[i] / (N + 1));
        }

        return frequencies;
    }
    public static void main(String[] args) {
        Countingfrequenciesofarrayelements obj = new Countingfrequenciesofarrayelements();
        int[] arr = {2, 3, 3, 2, 5};
        List<Integer> result = obj.frequencyCount(arr);
        System.out.println(result);
    }
}
