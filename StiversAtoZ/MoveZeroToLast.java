public class MoveZeroToLast {
    public void moveZeroes(int[] nums) {
        if(nums.length==1) return;
        int nonZeroIndex=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
            nums[nonZeroIndex]=nums[i];
            nonZeroIndex++;
            }
        }
        while(nonZeroIndex<nums.length){
            nums[nonZeroIndex]=0;
            nonZeroIndex++;
        } 
    }
    public static void main(String[] args) {
        MoveZeroToLast moveZeroToLast = new MoveZeroToLast();
        int arr[] = {0, 1, 0, 3, 12};
        moveZeroToLast.moveZeroes(arr);
        System.out.println("Array after moving zeroes to the end: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
} 
    
