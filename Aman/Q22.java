// replace 'A' with 2 and 'E' with 1 and '*' with 0
import java.util.*;

class Pair {
    int row;
    int col;
    int tm;

    Pair(int _row, int _col, int _tm) {
        this.row = _row;
        this.col = _col;
        this.tm = _tm;
    }
}

public class Q22 {
    public static int minTimeToInvade(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        Queue<Pair> q = new LinkedList<>();
        int[][] vis = new int[n][m];
        int cntFresh = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) {
                    q.add(new Pair(i, j, 0));
                    vis[i][j] = 2;
                } else {
                    vis[i][j] = 0;
                }
                if (grid[i][j] == 1) cntFresh++;
            }
        }

        int[] dRow = {-1, 1, 0, 0};
        int[] dCol = {0, 0, -1, 1};

        int time = 0;
        int rottedOranges = 0;

        while (!q.isEmpty()) {
            Pair p = q.poll();
            int r = p.row;
            int c = p.col;
            int t = p.tm;

            time = t;

            for (int i = 0; i < 4; i++) {
                int newRow = r + dRow[i];
                int newCol = c + dCol[i];

                if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < m && grid[newRow][newCol] == 1 && vis[newRow][newCol] == 0) {
                    q.add(new Pair(newRow, newCol, t + 1));
                    vis[newRow][newCol] = 2;
                    rottedOranges++;
                }
            }
        }

        if (rottedOranges == cntFresh) {
            return time;
        } else {
            return -1;
        }
    }

    public static int[][] convertGrid(String[] Q, int N, int M) {
        int[][] grid = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                char ch = Q[i].charAt(j);
                if (ch == 'A') grid[i][j] = 2;
                else if (ch == 'E') grid[i][j] = 1;
                else grid[i][j] = 0;
            }
        }
        return grid;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine();

        String[] Q = new String[N];
        for (int i = 0; i < N; i++) {
            Q[i] = scanner.nextLine();
        }

        int[][] grid = convertGrid(Q, N, M);
        int result = minTimeToInvade(grid);
        System.out.println(result);
        scanner.close();
    }
}


















// import java.util.*;
// public class Q22 {
    
//     public static int minTimeToInvade(int N, int M, String[] Q) {
//         // Convert strings to char grid for easier manipulation
//         char[][] grid = new char[N][M];
//         Queue<int[]> queue = new LinkedList<>();
//         int enemyCells = 0;
        
//         // Initialize grid and find initial 'A' positions
//         for (int i = 0; i < N; i++) {
//             for (int j = 0; j < M; j++) {
//                 grid[i][j] = Q[i].charAt(j);
//                 if (grid[i][j] == 'A') {
//                     queue.offer(new int[]{i, j});
//                 } else if (grid[i][j] == 'E') {
//                     enemyCells++;
//                 }
//             }
//         }
        
//         // If no enemy cells exist, return 0
//         if (enemyCells == 0) {
//             return 0;
//         }
        
//         // Directions for 4-directional movement (up, down, left, right)
//         int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
//         int time = 0;
        
//         // Multi-source BFS
//         while (!queue.isEmpty()) {
//             int size = queue.size();
//             boolean invaded = false;
            
//             // Process all cells at current time level
//             for (int i = 0; i < size; i++) {
//                 int[] current = queue.poll();
//                 int row = current[0];
//                 int col = current[1];
                
//                 // Check all 4 directions
//                 for (int[] dir : directions) {
//                     int newRow = row + dir[0];
//                     int newCol = col + dir[1];
                    
//                     // Check bounds and if it's an enemy cell
//                     if (newRow >= 0 && newRow < N && newCol >= 0 && newCol < M 
//                         && grid[newRow][newCol] == 'E') {
                        
//                         grid[newRow][newCol] = 'A'; // Invade the cell
//                         queue.offer(new int[]{newRow, newCol});
//                         enemyCells--;
//                         invaded = true;
//                     }
//                 }
//             }
            
//             // If we invaded at least one cell this second, increment time
//             if (invaded) {
//                 time++;
//             }
            
//             // If all enemy cells are invaded, return time
//             if (enemyCells == 0) {
//                 return time;
//             }
//         }
        
//         // If there are still enemy cells that couldn't be reached
//         return enemyCells > 0 ? -1 : time;
//     }
    
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         int N = scanner.nextInt();
//         int M = scanner.nextInt();
//         scanner.nextLine(); // consume newline
        
//         String[] Q = new String[N];
//         for (int i = 0; i < N; i++) {
//             Q[i] = scanner.nextLine();
//         }
        
//         int result = minTimeToInvade(N, M, Q);
//         System.out.println(result);
        
//         scanner.close();
//     }
// }