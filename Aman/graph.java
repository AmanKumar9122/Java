import java.util.*;
// edges of a graph
// [[4,5],[3,1],[2,3],[2,4]]
// graph implementation using adjacency matrix
// public class graph {
//     public void array(int v ,int [][]edges){
//         int[][] adj = new int[v][v];
//         for(int i = 0; i < edges.length; i++){
//             int u = edges[i][0];
//             int v1 = edges[i][1];
//             adj[u][v1] = 1;
//             adj[v1][u] = 1;
//         }
        
//         for(int i = 0; i < v; i++){
//             for(int j = 0; j < v; j++){
//                 System.out.print(adj[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         int[][] edges = {{4,5},{3,1},{2,3},{2,4}};
//         graph g = new graph();
//         g.array(6, edges);
//     }
// }


// implementation using adjacency list
public class graph {
    public void array(int v, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v1 = edges[i][1];
            adj.get(u).add(v1);
            adj.get(v1).add(u);
        }

        for (int i = 0; i < v; i++) {
            System.out.print(i + ": ");
            for (int j : adj.get(i)) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] edges = {{4, 5}, {3, 1}, {2, 3}, {2, 4}};
        graph g = new graph();
        g.array(6, edges);
    }
}

