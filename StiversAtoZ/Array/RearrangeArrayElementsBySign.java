public class RearrangeArrayElementsBySign {
        public int[] rearrangeArray(int[] nums) {
            int n = nums.length;
            int pos[] = new int[n/2];
            int neg[] = new int[n/2];
            int j=0 , k=0;
            for(int i=0;i<n;i++){
                if(nums[i]>0){
                    pos[j++]=nums[i];
                }else 
                    neg[k++]=nums[i];
            }
            j=0; 
            k=0;
            for(int i=0;i<n;i++){
                if(i%2==0){
                    nums[i]=pos[j++];
                }else
                    nums[i]=neg[k++];
            }
            return nums;
        }
    public static void main(String[] args) {
        RearrangeArrayElementsBySign obj = new RearrangeArrayElementsBySign();
        int[] arr = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
        int[] res = obj.rearrangeArray(arr);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
// Time Complexity: O(N)
// Space Complexity: O(N)
// Output: 2 -1 4 -3 5 -7 6 8 9
