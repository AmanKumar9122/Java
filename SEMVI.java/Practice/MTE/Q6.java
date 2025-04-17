// public class Q6 {
//     public int [] arr(int nums[] , int target){
//         int arr [] = new int[2];
//         int i=0;
//         int j=0;
//         int n = nums.length;
//         while(i<n&&j<n){
//             if(nums[i]+nums[j]==target){
//                 arr[0] = i;
//                 arr[1] = j;
//                 break;
//             }else{
//                 j++;
//             }
//         }
//         return arr;
//     }
//     public static void main(String[] args) {
//         int nums[] = {2,7,9,15};
//         int target = 9;
//         Q6 obj = new Q6();
//         System.out.println(obj.arr(nums, target));
//     }
// }

import java.util.Arrays;

public class Q6 {
    public int[] arr(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int nums[] = {2, 7, 9, 15};
        int target = 9;
        Q6 obj = new Q6();
        System.out.println(Arrays.toString(obj.arr(nums, target)));
    }
}
