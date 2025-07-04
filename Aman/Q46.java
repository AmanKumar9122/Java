import java.util.*;
import java.io.*;

public class Q46 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        Map<Long, Integer> modCount = new HashMap<>();
        modCount.put(0L, 1);
        long sum = 0;
        long ans = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            long mod = ((sum % n) + n) % n; // handle negative mods
            ans += modCount.getOrDefault(mod, 0);
            modCount.put(mod, modCount.getOrDefault(mod, 0) + 1);
        }

        System.out.println(ans);
    }
}
