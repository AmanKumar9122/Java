// Purpose: To find the square root of a number using binary search.
// Time complexity: O(log(n))
public class SquareRoot {
    public int sqrt(int x) {
        if(x==0 || x==1) return x;
        int left = 1, right = x, ans = 0;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(mid<=x/mid){
                ans = mid;
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        SquareRoot obj = new SquareRoot();
        System.out.println(obj.sqrt(16));
    }
    
}
