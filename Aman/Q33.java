// using union and disjoint set data structure
public class Q33 {
    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        int[] parent = new int[n + 1];
        int[] rank = new int[n + 1];
        
        // Initialize the parent and rank arrays
        for (int i = 1; i <= n; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
        
        for (int[] edge : edges) {
            if (!union(parent, rank, edge[0], edge[1])) {
                return edge; // If union fails, this edge is redundant
            }
        }
        
        return new int[0]; // No redundant connection found
        
    }
    public static int find(int[] parent, int x) {
        if (parent[x] != x) {
            parent[x] = find(parent, parent[x]); // Path compression
        }
        return parent[x];
    }
    public static boolean union(int[] parent, int[] rank, int x, int y) {
        int rootX = find(parent, x);
        int rootY = find(parent, y);
        if (rootX == rootY) {
            return false; // x and y are already in the same set
        }
        if (rank[rootX] > rank[rootY]) {
            parent[rootY] = rootX;
        } else if (rank[rootX] < rank[rootY]) {
            parent[rootX] = rootY;
        } else {
            parent[rootX] = rootY;
            rank[rootY]++;
        }
        return true; // x and y were successfully unioned
    }
}

