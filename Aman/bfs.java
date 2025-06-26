import java.lang.reflect.Array;
import java.util.*;

// public class bfs {
//     public void bfs(int v, int[][] edges, int start) {
//         List<List<Integer>> adj = new ArrayList<>();
//         for (int i = 0; i < v; i++) {
//             adj.add(new ArrayList<>());
//         }

//         for (int[] edge : edges) {
//             int u = edge[0];
//             int v1 = edge[1];
//             adj.get(u).add(v1);
//             adj.get(v1).add(u);
//         }

//         boolean[] visited = new boolean[v];
//         Queue<Integer> queue = new LinkedList<>();
//         ArrayList<Integer> bfsOrder = new ArrayList<>();
//         queue.add(start);
//         visited[start] = true;

//         while (!queue.isEmpty()) {
//             int node = queue.poll();
//             bfsOrder.add(node);

//             for (int neighbor : adj.get(node)) {
//                 if (!visited[neighbor]) {
//                     visited[neighbor] = true;
//                     queue.add(neighbor);
//                 }
//             }
//         }

//         System.out.println("BFS Order: " + bfsOrder);
//     }
//     public static void main(String[] args) {
//         // int[][] edges = {{1,2},{1,3},{2,4},{2,5},{3,6}};
//         int [][] edges = {{0,1},{1,2},{2,6},{0,7},{7,3},{3,6},{0,9},{9,5},{5,6}};
//         bfs g = new bfs();
//         //g.bfs(7, edges, 1);
//         g.bfs(10, edges, 1);
//     }
// }

//time complexity: O(V + E)
//space complexity: O(V + E) for the adjacency list and O(V) for the visited array and queue

// count the number of connected components in a graph
public class bfs {
    public int countComponents(int v, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v1 = edge[1];
            adj.get(u).add(v1);
            adj.get(v1).add(u);
        }

        boolean[] visited = new boolean[v];
        int count = 0;

        for (int i = 0; i < v; i++) {
            if (!visited[i]) {
                bfsUtil(i, adj, visited);
                count++;
            }
        }

        return count;
    }

    private void bfsUtil(int start, List<List<Integer>> adj, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();

            for (int neighbor : adj.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] edges = {{0, 1}, {1, 2}, {2, 6}, {0, 7}, {7, 3}, {3, 6}, {0, 9}, {9, 5}, {5, 6}};
        bfs g = new bfs();
        System.out.println("Number of connected components: " + g.countComponents(10, edges));
    }
}
