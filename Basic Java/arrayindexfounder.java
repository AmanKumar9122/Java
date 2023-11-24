public class arrayindexfounder{
    public static int findElementIndex(int[] arr, int target) {
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        int target = 6;
        int index = findElementIndex(numbers, target);      
        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index);
        } else {
            System.out.println("Element " + target + " not found in the array");
        }
    }
}
