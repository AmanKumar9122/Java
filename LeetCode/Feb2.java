class Feb2 {
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;
        if (nums[0]<nums[n-1]){
            count++;
        }
        for(int i = 0;i<n-1;i++){
            if(nums[i]>nums[i+1]){
                count++;
            }
            if(count>1){
                return false;
            }
        }
    return true;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        System.out.println(new Feb2().check(arr));
    }
}