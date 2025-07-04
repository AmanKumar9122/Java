import java.util.*;

public class SegmentTree {
    static final int N = 100005;
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
        segment[index] = segment[2 * index + 1] + segment[2 * index + 2]; // sum for range
    }

    public static int query(int index, int low, int high, int left, int right) {
        // completely outside
        if (high < left || low > right) {
            return 0;
        }
        // completely inside
        if (low >= left && high <= right) {
            return segment[index];
        }
        // partially inside
        int mid = (low + high) / 2;
        int l = query(2 * index + 1, low, mid, left, right);
        int r = query(2 * index + 2, mid + 1, high, left, right);
        return l + r;
    } 
    // time complexity O(log n)
    // maximum time complexity will be 4 * O(log(n))


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
        segment[index] = segment[2 * index + 1] + segment[2 * index + 2];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        build(0, 0, n - 1);

        int q = sc.nextInt();
        while (q-- > 0) {
            int type = sc.nextInt();
            if (type == 1) {
                int l = sc.nextInt();
                int r = sc.nextInt();
                System.out.println(query(0, 0, n - 1, l, r));
            } else if (type == 2) {
                int idx = sc.nextInt();
                int val = sc.nextInt();
                update(0, 0, n - 1, idx, val);
            }
        }
        sc.close();
    }
}