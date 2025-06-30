// union and disjoint set data structure
public class UnionAndFind {
    public static int find(int[] parent, int x) {
        if (parent[x] != x) {
            parent[x] = find(parent, parent[x]); // Path compression
        }
        return parent[x];
    }
    public static boolean union(int[] parent, int[] rank, int x, int y) {
        int rootX = find(parent, x);
        int rootY = find(parent, y);
        if( rootX == rootY) {
            return false; // x and y are already in the same set
        }
        if (rootX != rootY) {
            if (rank[rootX] > rank[rootY]) {
                parent[rootY] = rootX;
            } else if (rank[rootX] < rank[rootY]) {
                parent[rootX] = rootY;
            } else {
                parent[rootY] = rootX;
                rank[rootX]++;
            }
        }
        return true; // x and y were successfully unioned
    }
    public static void main(String[] args) {
        int n = 10; // Example size
        int[] parent = new int[n];
        int[] rank = new int[n];
        
        // Initialize the parent and rank arrays
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
        
        // Example union operations
        union(parent, rank, 1, 2);
        union(parent, rank, 2, 3);
        union(parent, rank, 4, 5);
        
        // Find operations
        System.out.println("Find(1): " + find(parent, 1)); // Should print the root of the set containing 1
        System.out.println("Find(2): " + find(parent, 2)); // Should print the root of the set containing 2
        System.out.println("Find(3): " + find(parent, 3)); // Should print the root of the set containing 3
        System.out.println("Find(4): " + find(parent, 4)); // Should print the root of the set containing 4
    }
}

