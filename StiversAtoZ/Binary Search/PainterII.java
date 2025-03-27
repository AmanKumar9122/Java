// Dilpreet wants to paint his dog's home that has n boards with different lengths. The length of ith board is given by arr[i] where arr[] is an array of n integers. He hired k painters for this work and each painter takes 1 unit time to paint 1 unit of the board.
// Return the minimum time to get this job done if all painters start together with the constraint that any painter will only paint continuous boards, say boards numbered [2,3,4] or only board [1] or nothing but not boards [2,4,5].

public class PainterII {
    public int minTime(int[] arr, int n, int k){
        int low = 0;
        int high = 0;
        for(int i=0;i<n;i++){
            high += arr[i];
            low = Math.max(low,arr[i]);
        }
        while(low<high){
            int mid = low + (high-low)/2;
            int painters = 1;
            int sum = 0;
            for(int i=0;i<n;i++){
                sum += arr[i];
                if(sum>mid){
                    sum = arr[i];
                    painters++;
                }
            }
            if(painters<=k){
                high = mid;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        PainterII obj = new PainterII();
        int[] arr = {5,10,30,20,15};
        int n = arr.length;
        int k = 3;
        System.out.println(obj.minTime(arr,n,k));
    }
}
//time complexity: O(n*log(sum(arr))) where n is the number of boards and arr is the array of board lengths.
//space complexity: O(1)
