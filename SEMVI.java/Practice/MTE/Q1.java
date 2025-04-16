// Prefix Sum Array: Find the sum of elements in a given range 
// [L, R] using a prefix sum array. 
public class Q1 {
    public int PreSum(int arr[],int L,int R){
        if(arr.length==0||arr==null||L>R||L<0||L>arr.length) return 0;
        int pre[] = new int[arr.length];
        pre[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            pre[i] = pre[i-1] + arr[i];
        }
        if(L==0) return pre[R]; //testcase1
        return pre[R]-pre[L-1];
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int L = 0;
        int R = 4;
        Q1 obj = new Q1();
        System.out.println(obj.PreSum(arr, L, R));
    }
}