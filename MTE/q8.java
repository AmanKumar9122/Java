public class q8 {

    public static int findSecondLargest(int[][] arr) {
        int largest = arr[0][0];
        int secondLargest = arr[0][1];

        // Iterate through the remaining elements
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                int currentElement = arr[i][j];

                if (currentElement > secondLargest) {
                    secondLargest = currentElement;

                    if (currentElement > largest) {
                        largest = currentElement;
                        secondLargest = arr[i - 1][j];
                    }
                }
            }
        }

        // Return the second largest element
        return secondLargest;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int secondLargest = findSecondLargest(arr);
        System.out.println("Second largest element in the 2D array: " + secondLargest);
    }
}