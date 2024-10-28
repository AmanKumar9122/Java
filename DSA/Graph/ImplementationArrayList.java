import java.util.*;

/**
 * ImplementationArrayList
 */
public class ImplementationArrayList {
    public static void main(String args[]) {
        int n = 3, m = 3;  // Number of vertices and edges
        
        // Create an adjacency list with n+1 (1-based index)
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        
        // Initialize the adjacency list
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<Integer>());
        }
        
        // Add edges between vertices
        // edge 1---2
        adj.get(1).add(2);
        adj.get(2).add(1);

        // edge 2---3
        adj.get(2).add(3);
        adj.get(3).add(2);

        // edge 1---3
        adj.get(1).add(3);
        adj.get(3).add(1);

        // Print adjacency list
        for (int i = 1; i <= n; i++) {  // 1-based indexing
            System.out.print("Adjacency list of vertex " + i + ": ");
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(adj.get(i).get(j) + " ");
            }
            System.out.println();
        }

        // Perform BFS
        ArrayList<Integer> bfsResult = bfsOfGraph(n, adj);
        System.out.println("BFS traversal: " + bfsResult);
    }

    public static ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // BFS traversal result
        ArrayList<Integer> bfs = new ArrayList<>();
        
        // Visited array to keep track of visited nodes
        boolean vis[] = new boolean[V + 1];  // 1-based index

        // Queue for BFS
        Queue<Integer> q = new LinkedList<>();
        
        // Start BFS from node 1
        q.add(1);
        vis[1] = true;
        
        while (!q.isEmpty()) {
            Integer node = q.poll();
            bfs.add(node);
            
            // Visit all adjacent nodes
            for (Integer it : adj.get(node)) {
                if (!vis[it]) {
                    vis[it] = true;
                    q.add(it);
                }
            }
        }
        return bfs;
    }
}
