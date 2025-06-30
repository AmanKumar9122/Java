// use union and disjoint set data structure to solve this problem
public class Q32 {
    public boolean validTree(int n, int[][] edges) {
        if (edges.length != n - 1) {
            return false; // A valid tree must have exactly n-1 edges
        }
        int[] parent = new int[n];
        int[] rank = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
        for (int[] edge : edges) {
            if (!union(parent, rank, edge[0], edge[1])) {
                return false; // If union fails, it means a cycle exists
            }
        }
        return true; // If all unions are successful, it's a valid tree

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
        if (rootX == rootY) {
            return false;
        }
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
    public static void main(String[] args) {
        Q32 q32 = new Q32(); 
        int n = 5;
        int[][] edges = {{0, 1}, {1, 2}, {2, 3}, {3, 4}};
        boolean result = q32.validTree(n, edges);
        System.out.println("Is valid tree: " + result); // Output: Is valid tree: true
    }
}

// class Q32_Alternate {
//     // Alternate solution for the same problem
//     // This solution checks if the number of edges is exactly n-1 and uses union-find to check for cycles
//     // If the number of edges is not n-1, it cannot be a valid tree
// public boolean validTree(int n, int[][] edges) {
//         int[] parent = new int[n];
//         int[] rank = new int[n];
//         for (int i = 0; i < n; i++) {
//             parent[i] = i;
//             rank[i] = 0;
//         }
//         for (int[] edge : edges) {
//             if (!union(parent, rank, edge[0], edge[1])) {
//                 return false; // If union fails, it means a cycle exists
//             }
//         }
//         int component  = 0;
//         for(int i=0;i<n;i++){
//             if(i == parent[i]){
//                 component++;
//             }
//         }
//         if(component == 1){
//             return true;
//         }
//         return false; // If all unions are successful, it's a valid tree

//     }
//     public static int find(int[] parent, int x) {
//         if (parent[x] != x) {
//             parent[x] = find(parent, parent[x]);
//         }
//         return parent[x];
//     }
//     public static boolean union(int[] parent, int[] rank, int x, int y) {
//         int rootX = find(parent, x);
//         int rootY = find(parent, y);
//         if (rootX == rootY) {
//             return false;
//         }
//         if (rank[rootX] > rank[rootY]) {
//             parent[rootY] = rootX;
//         } else if (rank[rootX] < rank[rootY]) {
//             parent[rootX] = rootY;
//         } else {
//             parent[rootX] = rootY;
//             rank[rootY]++;
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         Q32_Alternate q32 = new Q32_Alternate(); 
//         int n = 5;
//         int[][] edges = {{0, 1}, {1, 2}, {3, 4}, {4, 0}};
//         boolean result = q32.validTree(n, edges);
//         System.out.println("Is valid tree: " + result); // Output: Is valid
//         // tree: false
//     }
// }
