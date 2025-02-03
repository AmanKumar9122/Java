public class Feb3 {
    public int longestMonotonicSubarray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int maxi = 1; 
        int incLen=1; 
        int decre = 1; 

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                incLen++; 
                decre = 1; 
            } else if (nums[i] < nums[i - 1]) {
                decre++; 
                incLen = 1; 
            } else {
                incLen = 1;
                decre = 1;
            }
            maxi = Math.max(maxi, Math.max(incLen, decre));
        }
        return maxi;
    }
    public static void main(String[] args) {
        Feb3 obj = new Feb3();
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(obj.longestMonotonicSubarray(nums));
    }
}