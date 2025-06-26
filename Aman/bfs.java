import java.util.*;

public class bfs {
    public void bfs(int v, int[][] edges, int start) {
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
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

            for (int neighbor : adj.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] edges = {{1,2},{1,3},{2,4},{2,5},{3,6}};
        bfs g = new bfs();
        g.bfs(7, edges, 1);
    }
}
