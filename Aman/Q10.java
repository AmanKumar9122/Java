import java.util.*;
public class Q10{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            weights[i] = scanner.nextInt();
        }
        int result = solve(n, x, weights);
        System.out.println(result);
        scanner.close();
    }
    public static int solve(int n, int x, int[] weights) {
        Arrays.sort(weights);
        int left = 0;
        int right = n - 1;
        int gondolas = 0;
        while (left <= right) {
            if (weights[left] + weights[right] <= x) {
                left++;
            }
            right--;
            gondolas++;
        }
        return gondolas;
    }
}