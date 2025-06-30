import java.io.*;
import java.util.*;

public class Q36 {

    public static int find(int[] parent, int x) {
        if (parent[x] != x) {
            parent[x] = find(parent, parent[x]);
        }
        return parent[x];
    }

    public static boolean union(int[] parent, int[] rank, int x, int y) {
        int rootX = find(parent, x);
        int rootY = find(parent, y);
        if (rootX == rootY) return false;
        if (rank[rootX] > rank[rootY]) {
            parent[rootY] = rootX;
        } else if (rank[rootX] < rank[rootY]) {
            parent[rootX] = rootY;
        } else {
            parent[rootX] = rootY;
            rank[rootY]++;
        }
        return true;
    }

    public static long minimumReparationCost(int n, long[][] roads) {
        int[] parent = new int[n + 1];
        int[] rank = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            parent[i] = i;
            rank[i] = 0;
        }

        Arrays.sort(roads, Comparator.comparingLong(a -> a[2]));

        long totalCost = 0;
        int edgesUsed = 0;

        // Iterate through the sorted roads and apply union-find
        for (long[] road : roads) {
            int u = (int) road[0];
            int v = (int) road[1];
            long cost = road[2];
            if (union(parent, rank, u, v)) {
                totalCost += cost;
                edgesUsed++;
            }
        }

        return edgesUsed == n - 1 ? totalCost : -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        long[][] roads = new long[m][3];
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            roads[i][0] = Long.parseLong(st.nextToken());
            roads[i][1] = Long.parseLong(st.nextToken());
            roads[i][2] = Long.parseLong(st.nextToken());
        }

        long result = minimumReparationCost(n, roads);
        if (result == -1) {
            System.out.println("IMPOSSIBLE");
        } else {
            System.out.println(result);
        }
    }
}
