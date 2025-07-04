// Dynamic Range Minimum Queries
import java.util.*;
import java.io.*;

public class Q49 {
    static int N = 200005;
    static int[] arr = new int[N];
    static int[] segment = new int[4 * N];

    public static void build(int index, int low, int high) {
        if (low == high) {
            segment[index] = arr[low];
            return;
        }
        int mid = (low + high) / 2;
        build(2 * index + 1, low, mid);
        build(2 * index + 2, mid + 1, high);
        segment[index] = Math.min(segment[2 * index + 1], segment[2 * index + 2]);
    }

    public static int query(int index, int low, int high, int left, int right) {
        if (high < left || low > right) {
            return Integer.MAX_VALUE;
        }
        if (low >= left && high <= right) {
            return segment[index];
        }
        int mid = (low + high) / 2;
        int l = query(2 * index + 1, low, mid, left, right);
        int r = query(2 * index + 2, mid + 1, high, left, right);
        return Math.min(l, r);
    }

    public static void update(int index, int low, int high, int i, int val) {
        if (low == high) {
            segment[index] = val;
            arr[i] = val;
            return;
        }
        int mid = (low + high) / 2;
        if (i <= mid) {
            update(2 * index + 1, low, mid, i, val);
        } else {
            update(2 * index + 2, mid + 1, high, i, val);
        }
        segment[index] = Math.min(segment[2 * index + 1], segment[2 * index + 2]);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        build(0, 0, n - 1);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(br.readLine());
            int type = Integer.parseInt(st.nextToken());
            if (type == 1) {
                int k = Integer.parseInt(st.nextToken()) - 1;
                int u = Integer.parseInt(st.nextToken());
                update(0, 0, n - 1, k, u);
            } else if (type == 2) {
                int a = Integer.parseInt(st.nextToken()) - 1;
                int b = Integer.parseInt(st.nextToken()) - 1;
                sb.append(query(0, 0, n - 1, a, b)).append('\n');
            }
        }
        System.out.print(sb);
    }
}