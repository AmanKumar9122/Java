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

// bfs on a given 2d matrix
public class bfs {
    public void bfs(int[][] grid, int startRow, int startCol) {
        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] visited = new boolean[rows][cols];
        Queue<int[]> queue = new LinkedList<>();
        ArrayList<int[]> bfsOrder = new ArrayList<>();

        queue.add(new int[]{startRow, startCol});
        visited[startRow][startCol] = true;

        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            bfsOrder.add(cell);
            int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
            for (int[] dir : directions) {
                int newRow = cell[0] + dir[0];
                int newCol = cell[1] + dir[1];

                if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols && !visited[newRow][newCol]) {
                    visited[newRow][newCol] = true;
                    queue.add(new int[]{newRow, newCol});
                }
            }
        }

        System.out.print("BFS Order: ");
        for (int[] cell : bfsOrder) {
            System.out.print(grid[cell[0]][cell[1]] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] grid = {
            {0, 1, 0},
            {1, 0, 1},
            {0, 1, 0}
        };
        bfs g = new bfs();
        g.bfs(grid, 1, 1); // Starting from cell (1, 1)
    }
}