import java.util.*;
import java.io.*;

public class Q41 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        int[][] prefixSum = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            String line = br.readLine();
            for (int j = 1; j <= n; j++) {
                prefixSum[i][j] = prefixSum[i - 1][j] + prefixSum[i][j - 1]
                        - prefixSum[i - 1][j - 1] + (line.charAt(j - 1) == '*' ? 1 : 0);
            }
        }

        // Read all queries at once for faster input
        StringBuilder sb = new StringBuilder();
        StringBuilder allQueries = new StringBuilder();
        for (int i = 0; i < q; i++) {
            allQueries.append(br.readLine()).append(" ");
        }
        st = new StringTokenizer(allQueries.toString());

        for (int k = 0; k < q; k++) {
            int y1 = Integer.parseInt(st.nextToken());
            int x1 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());

            int result = prefixSum[y2][x2] - prefixSum[y1 - 1][x2]
                    - prefixSum[y2][x1 - 1] + prefixSum[y1 - 1][x1 - 1];
            sb.append(result).append('\n');
        }
        System.out.print(sb);
    }

    public static int countTrees(int[][] prefixSum, int y1, int x1, int y2, int x2) {
        return prefixSum[y2][x2] - prefixSum[y1 - 1][x2]
                - prefixSum[y2][x1 - 1] + prefixSum[y1 - 1][x1 - 1];
    }

    public static int[][] buildPrefixSum(int n, char[][] forest) {
        int[][] prefixSum = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                prefixSum[i][j] = prefixSum[i - 1][j] + prefixSum[i][j - 1]
                        - prefixSum[i - 1][j - 1] + (forest[i - 1][j - 1] == '*' ? 1 : 0);
            }
        }
        return prefixSum;
    }
}
