import java.util.Arrays;

public class q6 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int elementToInsert = 7;
        int positionToInsert = 2;

        // Create a new array with one more element than the original array
        int[] newArray = new int[array.length + 1];

        // Copy the elements from the original array to the new array
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        // Insert the new element at the specified position
        newArray[positionToInsert] = elementToInsert;

        // Shift the remaining elements to the right
        for (int i = positionToInsert + 1; i < newArray.length; i++) {
            newArray[i] = array[i - 1];
        }

        System.out.println("Original array: " + Arrays.toString(array));
        System.out.println("New array after inserting element at position " + positionToInsert + ": " + Arrays.toString(newArray));
    }
}