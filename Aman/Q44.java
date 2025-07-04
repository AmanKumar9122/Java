// Subarray Sums I
// Sliding window approach (works only for all positive integers)
import java.util.*;
import java.io.*;

public class Q44 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        long x = Long.parseLong(st.nextToken());

        long[] arr = new long[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        int left = 0;
        long sum = 0;
        long ans = 0;

        for (int right = 0; right < n; right++) {
            sum += arr[right];
            while (sum > x && left <= right) {
                sum -= arr[left];
                left++;
            }
            if (sum == x) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}