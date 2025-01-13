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
