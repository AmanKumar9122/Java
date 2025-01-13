import java.util.*;
public class SortColor {
    public void sortColor(int[] nums){
        int low=0,mid=0;
        int high = nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                swapNumber(nums,mid,low);
                mid++;
                low++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swapNumber(nums,mid,high);
                high--;
            }
        }
    }
    public void swapNumber(int[] nums, int midIndex ,int IndexToBeSwapped){
        int temp = nums[midIndex];
        nums[midIndex]=nums[IndexToBeSwapped];
        nums[IndexToBeSwapped]=temp;
    }
    public static void main(String[] args) {
        int nums [] = {1,0,2,1,0,2,1};
        SortColor obj = new SortColor();
        obj.sortColor(nums);
        System.out.println(Arrays.toString(nums));
    }
}

// The Dutch National Flag Algorithm is a sorting algorithm devised by Edsger W. Dijkstra.
// It is specifically designed to sort arrays with three distinct elements efficiently in a single traversal.
// The algorithm uses three pointers to partition the array into three groups and ensures that each group is sorted as the array is processed.

// Problem Description:
// Given an array containing three distinct types of elements (e.g., 0, 1, and 2), 
// the goal is to rearrange the elements so that all 0s come first, followed by 1s, 
// and then 2s, while maintaining O(n) time complexity and O(1) space complexity.
