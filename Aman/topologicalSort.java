// edges are = [[0,3],[3,4],[6,2],[2,5],[4,5],[5,9],[7,5],[1,8],[8,9]]
// implement topological sort using Kahn's algorithm and bfs
import java.util.*;
// public class topologicalSort {
//     public static List<Integer> topologicalSort(int V, int[][] edges) {
//         List<List<Integer>> adj = new ArrayList<>();
//         for (int i = 0; i < V; i++) {
//             adj.add(new ArrayList<>());
//         }

//         // Build the adjacency list
//         for (int[] edge : edges) {
//             int u = edge[0];
//             int v1 = edge[1];
//             adj.get(u).add(v1);
//         }

//         // Calculate in-degrees
//         int[] inDegree = new int[V];
//         for (int i = 0; i < V; i++) {
//             for (int neighbor : adj.get(i)) {
//                 inDegree[neighbor]++;
//             }
//         }

//         // Initialize the queue with nodes having in-degree 0
//         Queue<Integer> queue = new LinkedList<>();
//         for (int i = 0; i < V; i++) {
//             if (inDegree[i] == 0) {
//                 queue.add(i);
//             }
//         }

//         List<Integer> topoOrder = new ArrayList<>();
        
//         while (!queue.isEmpty()) {
//             int node = queue.poll();
//             topoOrder.add(node);

//             // Decrease in-degree of neighbors
//             for (int neighbor : adj.get(node)) {
//                 inDegree[neighbor]--;
//                 if (inDegree[neighbor] == 0) {
//                     queue.add(neighbor);
//                 }
//             }
//         }

//         // Check if topological sort is possible (i.e., no cycle)
//         if (topoOrder.size() != V) {
//             return Collections.emptyList(); // Cycle detected, return empty list
//         }

//         return topoOrder;
//     }

//     public static void main(String[] args) {
//         int[][] edges = {{0, 3}, {3, 4}, {6, 2}, {2, 5}, {4, 5}, {5, 9}, {7, 5}, {1, 8}, {8, 9}};
//         List<Integer> result = topologicalSort(10, edges);
//         System.out.println("Topological Sort Order: " + result);
//     }   
// }
// time complexity: O(V + E)


// course schedule problem 2
class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        // Build the adjacency list
        for (int[] edge : prerequisites) {
            int u = edge[1];
            int v1 = edge[0];
            adj.get(u).add(v1);
        }

        // Calculate in-degrees
        int[] inDegree = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            for (int neighbor : adj.get(i)) {
                inDegree[neighbor]++;
            }
        }

        // Initialize the queue with nodes having in-degree 0
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] == 0) {
                queue.add(i);
            }
        }

        List<Integer> topoOrder = new ArrayList<>();
        
        while (!queue.isEmpty()) {
            int node = queue.poll();
            topoOrder.add(node);

            // Decrease in-degree of neighbors
            for (int neighbor : adj.get(node)) {
                inDegree[neighbor]--;
                if (inDegree[neighbor] == 0) {
                    queue.add(neighbor);
                }
            }
        }

        // Check if topological sort is possible (i.e., no cycle)
        if (topoOrder.size() != numCourses) {
            return new int[0]; // Cycle detected, return empty array
        }

        // Convert List to int[]
        return topoOrder.stream().mapToInt(i -> i).toArray();
    }
}
