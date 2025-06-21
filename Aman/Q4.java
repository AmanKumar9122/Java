// https://codeforces.com/problemset/problem/381/A
import java.util.*;

public class Q4 {
    public int []arr(int []nums, int n){
        int []result = new int[2];
        int i = 0;
        int j = n - 1;
        int count = 0;
        int sumA = 0;
        int sumB = 0;
        while(i<=j){
            if(nums[i]<nums[j]){
                if(count%2==0){
                    sumA += nums[j];
                }else{
                    sumB += nums[j];
                }
                j--;
            }
            else{
                if(count%2==0){
                    sumA += nums[i];
                }else{
                    sumB += nums[i];
                }
                i++;
            }
            count++;
        }
        result[0] = sumA;
        result[1] = sumB;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // calling the function
        Q4 obj = new Q4();
        int [] result = obj.arr(arr, n);
        // printing the result
        System.out.println(result[0] + " " + result[1]);
        sc.close();
    }
    
}