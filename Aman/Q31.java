public class Q31 {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        int []parent = new int[n];
        int []rank = new int[n];
        for(int i=0;i<n;i++){
            parent[i] = i;
            rank[i] = 0;
        }
        for(int[] edge : edges){
            union(parent, rank, edge[0], edge[1]);
        }
        return find(parent, source) == find(parent, destination);
    }
    public static int find(int[] parent, int x) {
        if (parent[x] != x) {
            parent[x] = find(parent, parent[x]);
        }
        return parent[x];
    }
    public static boolean union(int[] parent, int[] rank, int x, int y) {
        int rootX = find(parent, x);
        int rootY = find(parent, y);
        if( rootX == rootY) {
            return false;
        }
        if (rootX != rootY) {
            if (rank[rootX] > rank[rootY]) {
                parent[rootY] = rootX;
            } else if (rank[rootX] < rank[rootY]) {
                parent[rootX] = rootY;
            } else {
                parent[rootX] = rootY;
                rank[rootY]++;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Q31 q31 = new Q31();
        int n = 5;
        int[][] edges = {{0, 1}, {1, 2}, {2, 3}, {3, 4}};
        int source = 0;
        int destination = 4;
        boolean result = q31.validPath(n, edges, source, destination);
        System.out.println("Path exists: " + result); // Output: Path exists: true
    }
}
    
