// Maximum Subarray of Size K: Find the maximum sum of any 
// subarray of size K. 
public class Q4 {
    public int maxSum(int arr[],int k){
        if(arr.length<k) {
            System.out.println("Array size is smaller than k");
            return -1;
        }
        int sum = 0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int maxi = 0;
        for(int i=k;i<arr.length;i++){
            sum+= arr[i] - arr[i-k];
            maxi = Math.max(maxi,sum);
        }
        return maxi;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,6,-1,-8,9,6,2};
        int k = 4;
        Q4 obj = new Q4();
        System.out.println(obj.maxSum(arr, k));
    }
}
