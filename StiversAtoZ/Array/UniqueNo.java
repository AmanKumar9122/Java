public class UniqueNo {
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 3, 5, 7, 2};
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println("Unique number is: " + nums[i]);
                break;
            }
        }
        
        // int ans = 0;
        // for(int i=0;i<nums.length;i++){
        //     ans^=nums[i];
        // }
        // System.out.println(ans);
    }
}
