import java.io.*;
import java.util.*;

public class BytelandRoads {

    static int[] parent;

    // Find with path compression
    public static int find(int x) {
        if (parent[x] != x)
            parent[x] = find(parent[x]);
        return parent[x];
    }

    // Union by root
    public static void union(int a, int b) {
        int rootA = find(a);
        int rootB = find(b);
        if (rootA != rootB)
            parent[rootB] = rootA;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // cities
        int m = Integer.parseInt(st.nextToken()); // existing roads

        parent = new int[n + 1];
        for (int i = 1; i <= n; i++) parent[i] = i;

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            union(a, b);
        }

        // Find unique components
        List<Integer> reps = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (find(i) == i) {
                reps.add(i);
            }
        }

        // Output the roads needed
        int k = reps.size() - 1;
        System.out.println(k);
        for (int i = 1; i < reps.size(); i++) {
            System.out.println(reps.get(i - 1) + " " + reps.get(i));
        }
    }
}
