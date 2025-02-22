public class KadanesAlogrithm {
        public int maxSubArray(int[] nums) {
            int sum = 0;
            int max = Integer.MIN_VALUE;
            for(int i=0;i<nums.length;i++){
                sum+=nums[i];
                if(sum>max){
                    max=sum;
                }
                if(sum<0){
                    sum=0;
                }
            }
            return max;
        }
    public static void main(String[] args) {
        KadanesAlogrithm obj = new KadanesAlogrithm();
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(obj.maxSubArray(arr));
    }
}
