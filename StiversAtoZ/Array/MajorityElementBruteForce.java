public class MajorityElementBruteForce {
        public int majorityElement(int[] arr) {
            int n = arr.length;
            for(int i=0;i<n;i++){
                int count=0;
                for(int j=0;j<n;j++){
                    if(arr[i]==arr[j]){
                        count++;
                    }
                }
                if(count>n/2) return arr[i];
            }
            return -1;
        }
        public static void main(String[] args) {
            MajorityElementBruteForce obj = new MajorityElementBruteForce();
            int[] arr = {3,2,3};
            System.out.println(obj.majorityElement(arr));
             
        }
}
// Time Complexity: O(N^2)
// Space Complexity: O(1)