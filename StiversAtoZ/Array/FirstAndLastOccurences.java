public class FirstAndLastOccurences {
    public static int[] findFirstAndLastOccurences(int[] arr, int target) {
        int[] result = new int[2];
        result[0] = findFirstOccurence(arr, target);
        result[1] = findLastOccurence(arr, target);
        return result;
    }

    private static int findFirstOccurence(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int firstOccurence = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                firstOccurence = mid;
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return firstOccurence;
    }

    private static int findLastOccurence(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int lastOccurence = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                lastOccurence = mid;
                low = mid + 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return lastOccurence;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        int target = 5;
        int[] result = findFirstAndLastOccurences(arr, target);
        System.out.println("First occurence: " + result[0]);
        System.out.println("Last occurence: " + result[1]);
    }
    
}
