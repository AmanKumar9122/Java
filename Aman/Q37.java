import java.util.*;

class Q37 {
    static int[] parent;
    static int[] rank;
    static Map<Integer, TreeSet<Integer>> componentMap;
    static Map<Integer, Integer> componentBeauty;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();

        parent = new int[n + 1];
        rank = new int[n + 1];
        componentMap = new HashMap<>();
        componentBeauty = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            parent[i] = i;
            rank[i] = 0;
            TreeSet<Integer> set = new TreeSet<>();
            set.add(i);
            componentMap.put(i, set);
            componentBeauty.put(i, 1); // each node = 1 segment
        }

        int totalBeauty = 0;

        for (int i = 0; i < q; i++) {
            int type = sc.nextInt();
            int u = sc.nextInt();
            int v = sc.nextInt();

            if (type == 1) {
                int ru = find(u);
                int rv = find(v);

                if (ru != rv) {
                    // ✅ your union logic with rank update
                    int newRoot = union(ru, rv);
                    int oldRoot = (newRoot == ru) ? rv : ru;

                    TreeSet<Integer> setNew = componentMap.get(newRoot);
                    TreeSet<Integer> setOld = componentMap.get(oldRoot);
                    int beauty = componentBeauty.get(newRoot);

                    for (int node : setOld) {
                        boolean hasLeft = setNew.contains(node - 1);
                        boolean hasRight = setNew.contains(node + 1);

                        if (hasLeft && hasRight) {
                            beauty--; // merges two segments
                        } else if (!hasLeft && !hasRight) {
                            beauty++; // new segment
                        }
                        // else, beauty unchanged
                        setNew.add(node);
                    }

                    componentMap.put(newRoot, setNew);
                    componentMap.remove(oldRoot);
                    componentBeauty.put(newRoot, beauty);
                    componentBeauty.remove(oldRoot);
                }
            } else if (type == 2) {
                int root = find(u);
                totalBeauty += componentBeauty.get(root);
            }
        }

        System.out.println(totalBeauty);
    }

    static int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]); // path compression
        }
        return parent[x];
    }
    
    static int union(int x, int y) {
        if (rank[x] < rank[y]) {
            parent[x] = y;
            return y;
        } else if (rank[x] > rank[y]) {
            parent[y] = x;
            return x;
        } else {
            parent[x] = y;
            rank[y]++;
            return y;
        }
    }
}