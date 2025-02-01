class Feb1 {
    public boolean isArraySpecial(int[] nums) {
        if(nums.length==1) return true;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]%2==0 && nums[i]%2==0) return false;
            if(nums[i-1]%2==1 && nums[i]%2==1) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        System.out.println(new Feb1().isArraySpecial(arr));
    }
}