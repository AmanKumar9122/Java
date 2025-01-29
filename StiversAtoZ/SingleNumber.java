public class SingleNumber {
    public static void main(String[] args) {
        int arr[] = {4, 1, 2, 1, 2};
        int n = arr.length;
        int single = singleNumber(arr);
        System.out.println("Single number: " + single);
    }
    public static int singleNumber(int[] nums) {
        int single = 0;
        for(int i=0;i<nums.length;i++){
            single^=nums[i];
        }
        return single;
    }
}
