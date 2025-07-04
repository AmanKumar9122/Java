// Subarray Sum II
// Find the number of subarrays with sum exactly x (works for positive and negative integers)
import java.util.*;
import java.io.*;

public class Q45 {
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

        Map<Long, Integer> prefixCount = new HashMap<>();
        prefixCount.put(0L, 1);
        long sum = 0;
        long ans = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            ans += prefixCount.getOrDefault(sum - x, 0);
            prefixCount.put(sum, prefixCount.getOrDefault(sum, 0) + 1);
        }

        System.out.println(ans);
    }
}
