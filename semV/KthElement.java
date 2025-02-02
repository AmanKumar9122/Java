// import java.util.Arrays;
// import java.util.Collections;

// public class KthElement {
//     public static int findKthSmallest(Integer[] arr, int k) {
//         Arrays.sort(arr);
//         return arr[k - 1];
//     }
//     public static int findKthLargest(Integer[] arr, int k) {
//         Arrays.sort(arr, Collections.reverseOrder());
//         return arr[k - 1];
//     }
    
//     public static void main(String[] args) {
//         Integer[] arr = {12, 3, 5, 7, 19};
//         int k = 2;

//         int kthSmallest = findKthSmallest(arr, k);
//         System.out.println(k + "th smallest element is " + kthSmallest);

//         int kthLargest = findKthLargest(arr, k);
//         System.out.println(k + "th largest element is " + kthLargest);
//     }
// }

// // time complexity = O(nlogn)
// // space complexity = O(n)



//find the kth smallest and largest element in an array

import java.util.Arrays;
public class KthElement {
    static int []kth(int []arr,int k){
        Arrays.sort(arr);
        int n=arr.length;
        int result[]={arr[n-k],arr[k-1]};
        return result;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(kth(arr, 2)));
    }
}

// time complexity = O(nlogn)
// space complexity = O(1)


