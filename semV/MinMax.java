// import java.util.*;
// public class minMax {
//     public static void main(String[] args) {
//         int arr[]={4, 5, 7, 8, 9, 4, 6, 1, 3, 18};
//         Arrays.sort(arr); 
//         System.out.println("Maximum Element:"+arr[arr.length-1]);
//         System.out.println("Minimum Element:"+arr[0]);
//     }  
// }

//time complexity:O(nlogn)
//space complexity:O(1)

import java.util.*;

public class minMax {
    public static void main(String[] args) {
        int arr[] = {4, 5, 7, 8, 9, 4, 6, 1, 3, 18};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            if (arr[left] < min) {
                min = arr[left];
            }
            if (arr[left] > max) {
                max = arr[left];
            }
            if (arr[right] < min) {
                min = arr[right];
            }
            if (arr[right] > max) {
                max = arr[right];
            }
            left++;
            right--;
        }

        System.out.println("Minimum Element: " + min);
        System.out.println("Maximum Element: " + max);
    }
}

//time complexity:O(n)
//space complexity:O(1)


// import java.util.Arrays;

// class minMax {
//     public static int[] maxmin(int[] arr, int n) {
//         int max = arr[0];
//         int min = arr[0];
//         for (int i = 0; i < n; i++) {
//             if (arr[i] > max) {
//                 max = arr[i];
//             } else if (arr[i] < min) {
//                 min = arr[i];
//             }
//         }
//         int[] output = {max, min};
//         return output;
//     }

//     public static void main(String[] args) {
//         int[] arr = {1, 22, 5, 6, 4, 3, 9};
//         int n = arr.length;
//         int[] result = maxmin(arr, n);
//         System.out.println("Maximum and Minimum elements: " + Arrays.toString(result));
//     }
// }


