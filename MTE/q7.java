import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class q7 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 4, 5, 2};

        // Create an empty set to store unique elements
        Set<Integer> uniqueElements = new HashSet<>();

        // Iterate through the array and add each element to the set
        for (int num : arr) {
            uniqueElements.add(num);
        }

        // Convert the set back to an array
        int[] uniqueArray = new int[uniqueElements.size()];
        int index = 0;
        for (int num : uniqueElements) {
            uniqueArray[index++] = num;
        }

        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArray));
    }
}