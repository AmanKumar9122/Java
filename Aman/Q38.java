// // implementation of dijkstra algorithm
// // use priority queue to find the shortest path from source to all other nodes
// // adjacency list representation of graph is used
// import java.util.*;
// public class Q38 {
// // Using ArrayList<ArrayList<int[]>> representation of graph
//     public static int[] dijkstra(int n, ArrayList<ArrayList<int[]>> graph, int source) {
//     // Distance array initialized to infinity
//     int[] dist = new int[n];
//     Arrays.fill(dist, Integer.MAX_VALUE);
//     dist[source] = 0;
        
//     // Priority queue for the minimum distance node
//     PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1]));
//     pq.offer(new int[]{source, 0});
        
//     // Track visited nodes to avoid reprocessing
//     boolean[] visited = new boolean[n];
        
//     while (!pq.isEmpty()) {
//         int[] current = pq.poll();
//         int node = current[0];
//         int currentDist = current[1];
        
//         // Skip if node already processed
//         if (visited[node]) continue;
//             visited[node] = true;
            
//             // Explore all neighbors
//             for (int[] neighbor : graph.get(node)) {
//                 int nextNode = neighbor[0];
//                 int weight = neighbor[1];
                
//                 // Relaxation step
//                 if (!visited[nextNode] && dist[node] != Integer.MAX_VALUE && 
//                     dist[node] + weight < dist[nextNode]) {
//                     dist[nextNode] = dist[node] + weight;
//                     pq.offer(new int[]{nextNode, dist[nextNode]});
//                 }
//             }
//         }
        
//         return dist;
//     }
//     public static void main(String[] args) {
//         // Example usage
//         int n = 5; // Number of nodes
//         ArrayList<ArrayList<int[]>> graph = new ArrayList<>();
        
//         for (int i = 0; i < n; i++) {
//             graph.add(new ArrayList<>());
//         }
        
//         // Adding edges: graph[node].add(new int[]{neighbor, weight});
//         graph.get(0).add(new int[]{1, 10});
//         graph.get(0).add(new int[]{2, 3});
//         graph.get(1).add(new int[]{2, 1});
//         graph.get(1).add(new int[]{3, 2});
//         graph.get(2).add(new int[]{3, 8});
//         graph.get(3).add(new int[]{4, 7});
        
//         int source = 0;
//         int[] distances = dijkstra(n, graph, source);
        
//         System.out.println("Shortest distances from source " + source + ": " + Arrays.toString(distances));
//     }
// }
import java.util.*;
class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<int[]>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        
        for (int[] time : times) {
            int u = time[0] - 1; 
            int v = time[1] - 1;
            int w = time[2];
            graph.get(u).add(new int[]{v, w});
        }
        
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[k - 1] = 0;
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1]));
        pq.offer(new int[]{k - 1, 0});
        
        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int node = current[0];
            int currentDist = current[1];
            
            if (currentDist > dist[node]) continue;
            
            for (int[] neighbor : graph.get(node)) {
                int nextNode = neighbor[0];
                int weight = neighbor[1];
                
                if (dist[node] + weight < dist[nextNode]) {
                    dist[nextNode] = dist[node] + weight;
                    pq.offer(new int[]{nextNode, dist[nextNode]});
                }
            }
        }
        
        int maxDist = 0;
        for (int d : dist) {
            if (d == Integer.MAX_VALUE) {
                return -1;
            }
            maxDist = Math.max(maxDist, d);
        }
        return maxDist == Integer.MAX_VALUE ? -1 : maxDist;
    }
}