// Problem: Number of Ways to Arrive at Destination
// find distance from source to destination and number of ways to reach destination
// then store it in frequency array
import java.util.*;
class Solution {
    public int countPaths(int n, int[][] roads) {
        final int MOD = 1000000007;
        List<List<int[]>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        
        for (int[] road : roads) {
            int u = road[0], v = road[1], time = road[2];
            graph.get(u).add(new int[]{v, time});
            graph.get(v).add(new int[]{u, time});
        }
        
        long[] dist = new long[n];
        Arrays.fill(dist, Long.MAX_VALUE);
        dist[0] = 0;
        
        long[] ways = new long[n];
        ways[0] = 1;
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Long.compare(a[1], b[1]));
        pq.offer(new int[]{0, 0}); // {node, distance}
    
        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int node = current[0];
            long currentDist = current[1];
            
            if (currentDist > dist[node]) continue;
            
            for (int[] neighbor : graph.get(node)) {
                int nextNode = neighbor[0];
                long weight = neighbor[1];
                
                if (dist[node] + weight < dist[nextNode]) {
                    dist[nextNode] = dist[node] + weight;
                    ways[nextNode] = ways[node];
                    pq.offer(new int[]{nextNode, (int)dist[nextNode]});

                } else if (dist[node] + weight == dist[nextNode]) {
                    ways[nextNode] = (ways[nextNode] + ways[node]) % MOD;
                }
            }
        }
        
        return (int) ways[n - 1];  
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 7;
        int[][] roads = {
            {0, 1, 2},
            {0, 2, 4},
            {1, 3, 2},
            {1, 4, 3},
            {2, 4, 1},
            {3, 5, 1},
            {4, 5, 2},
            {5, 6, 3}
        };
        System.out.println(solution.countPaths(n, roads)); // Output: number of ways to reach destination
    }
}

// explaination:
// 1. We create a graph using an adjacency list where each node points to its neighbors and the weight of the edge to that neighbor.
// 2. We initialize a distance array to keep track of the shortest distance from the source to each node, and a ways array to count the number of ways to reach each node.
// 3. We use a priority queue to implement Dijkstra's algorithm, where we always process the node with the smallest distance.
// 4. For each neighbor of the current node, we check if we can improve the distance to that neighbor. If we can, we update the distance and the number of ways to reach that neighbor.
// 5. If we find another way to reach the neighbor with the same distance, we add the number of ways from the current node to the number of ways to reach that neighbor.
// 6. Finally, we return the number of ways to reach the destination node (n-1) modulo 10^9 + 7.
