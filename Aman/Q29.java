// class Q29 {
//     int find(int par[], int x) {
//         // add code here.
//         if (par[x] == x) {
//             return x;
//         }
//         // Path compression
//         par[x] = find(par, par[x]);
//         return par[x];
//     }

//     void unionSet(int par[], int x, int z) {
//         // add code here.
//         int xRoot = find(par, x);
//         int zRoot = find(par, z);
//         if (xRoot != zRoot) {
//             par[xRoot] = zRoot;
//         }
//     }
//     public static void main(String[] args) {
//         Q29 q = new Q29();
//         int par[] = new int[10];
//         for (int i = 0; i < 10; i++) {
//             par[i] = i; // Initialize each element to be its own parent
//         }

//         // Example usage
//         q.unionSet(par, 1, 2);
//         q.unionSet(par, 2, 3);
//         System.out.println(q.find(par, 1)); // Should print the root of the set containing 1
//         System.out.println(q.find(par, 2)); // Should print the root of the set containing 2
//         System.out.println(q.find(par, 3)); // Should print the root of the set containing 3
//     }
// }

class Q29 {
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
}