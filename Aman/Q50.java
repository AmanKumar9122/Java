import java.util.*;
import java.io.*;

public class Q50 {
    
    static class SegmentTree {
        private int[] tree;
        private int n;
        
        public SegmentTree(int[] arr) {
            n = arr.length;
            tree = new int[4 * n];
            build(arr, 1, 0, n - 1, 1);
        }
        
        private void build(int[] arr, int node, int start, int end, int level) {
            if (start == end) {
                tree[node] = arr[start];
            } else {
                int mid = (start + end) / 2;
                build(arr, 2 * node, start, mid, level + 1);
                build(arr, 2 * node + 1, mid + 1, end, level + 1);
                
                if (level % 2 == 1) {
                    tree[node] = tree[2 * node] | tree[2 * node + 1];
                } else {
                    tree[node] = tree[2 * node] ^ tree[2 * node + 1];
                }
            }
        }
        
        public void update(int idx, int val) {
            update(1, 0, n - 1, idx, val, 1);
        }
        
        private void update(int node, int start, int end, int idx, int val, int level) {
            if (start == end) {
                tree[node] = val;
            } else {
                int mid = (start + end) / 2;
                if (idx <= mid) {
                    update(2 * node, start, mid, idx, val, level + 1);
                } else {
                    update(2 * node + 1, mid + 1, end, idx, val, level + 1);
                }
                
                if (level % 2 == 1) {
                    tree[node] = tree[2 * node] | tree[2 * node + 1];
                } else {
                    tree[node] = tree[2 * node] ^ tree[2 * node + 1];
                }
            }
        }
        
        public int getResult() {
            return tree[1];
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int size = 1 << n;
        int[] a = new int[size];
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < size; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        
        SegmentTree segTree = new SegmentTree(a);
        
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            p--;
            
            segTree.update(p, b);
            pw.println(segTree.getResult());
        }
        
        pw.close();
        br.close();
    }
}