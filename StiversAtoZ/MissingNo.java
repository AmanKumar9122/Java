public class MissingNo {
    public static void main(String[] args) {
        int arr[] = {3, 0, 1};
        int n = arr.length;
        int missing = missingNumber(arr);
        System.out.println("Missing number: " + missing);
    }
    public static int missingNumber(int[] nums) {
        int sum = 0;
        int totalSum = ((nums.length)*(nums.length+1))/2;
        int missing = 0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        missing = totalSum - sum;
        if(missing==nums.length) return nums.length;
        return missing;
    }
}
