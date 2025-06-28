class Q30 {
    // Function to merge two nodes a and b.
    public void union_(int a, int b, int par[], int rank[]) {
        // add your code here
        int rootA = find(par, a);
        int rootB = find(par, b);
        if (rootA != rootB) {
            // Union by rank
            if (rank[rootA] < rank[rootB]) {
                par[rootA] = rootB;
            } else if (rank[rootA] > rank[rootB]) {
                par[rootB] = rootA;
            } else {
                par[rootB] = rootA;
                rank[rootA]++;
            }
        }
    }

    // Function to find the parent of a node.
    public int find(int par[], int x) {
        // add your code here
        if (par[x] != x) {
            // Path compression
            par[x] = find(par, par[x]);
        }
        return par[x];
    }

    // Function to check whether 2 nodes are connected or not.
    public Boolean isConnected(int a, int b, int par[], int rank[]) {
        // add your code here
        return find(par, a) == find(par, b);
    }
    public static void main(String[] args) {
        Q30 q = new Q30();
        int n = 10; // Number of nodes
        int par[] = new int[n];
        int rank[] = new int[n];

        // Initialize each node to be its own parent and rank to 0
        for (int i = 0; i < n; i++) {
            par[i] = i;
            rank[i] = 0;
        }

        // Example usage
        q.union_(1, 2, par, rank);
        q.union_(2, 3, par, rank);
        System.out.println(q.isConnected(1, 3, par, rank)); // Should print true
        System.out.println(q.isConnected(1, 4, par, rank)); // Should print false
    }
}
