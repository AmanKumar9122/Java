import java.util.*;

public class Q7 {
    public int solve(int n){
        int count = 0;
        while (n > 0){
            int originalN = n;
            int digitCount = 0;
            int temp = n;
            
            while(temp > 0){
                digitCount++;
                temp /= 10;
            }
            
            int arr[] = new int[digitCount];
            temp = originalN;
            
            for(int i = 0; i < digitCount; i++){
                arr[i] = temp % 10;
                temp /= 10;
            }
            
            Arrays.sort(arr);
            n = originalN - arr[arr.length - 1];
            count++;
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Q7 obj = new Q7();
        int result = obj.solve(n);
        System.out.println(result);
        sc.close();
    }
}