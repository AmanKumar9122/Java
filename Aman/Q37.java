import java.util.*;

public class Q37 {
    private int[] parent;
    private int[] rank;
    private Map<Integer, Set<Integer>> componentNodes; // Maps root to all nodes in component
    private Map<Integer, Integer> componentBeauty; // Maps root to beauty value
    
    public int sumOfBeauty(int n, int q, int[][] queries) {
        parent = new int[n + 1];
        rank = new int[n + 1];
        componentNodes = new HashMap<>();
        componentBeauty = new HashMap<>();
        
        // Initialize the parent and rank arrays
        for (int i = 1; i <= n; i++) {
            parent[i] = i;
            rank[i] = 0;
            // Each node starts as its own component with beauty = 1
            Set<Integer> nodeSet = new TreeSet<>();
            nodeSet.add(i);
            componentNodes.put(i, nodeSet);
            componentBeauty.put(i, 1);
        }
        
        int totalBeauty = 0;
        
        for (int[] query : queries) {
            if (query[0] == 1) { // Type 1 query: Add edge
                union(query[1], query[2]);
            } else if (query[0] == 2) { // Type 2 query: Find beauty
                totalBeauty += findBeauty(query[1]);
            }
        }
        
        return totalBeauty;
    }
    
    private int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]); // Path compression
        }
        return parent[x];
    }
    
    private boolean union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        
        if (rootX == rootY) {
            return false; // x and y are already in the same set
        }
        
        // Determine which root becomes the new root
        int newRoot, oldRoot;
        if (rank[rootX] > rank[rootY]) {
            parent[rootY] = rootX;
            newRoot = rootX;
            oldRoot = rootY;
        } else if (rank[rootX] < rank[rootY]) {
            parent[rootX] = rootY;
            newRoot = rootY;
            oldRoot = rootX;
        } else {
            parent[rootX] = rootY;
            rank[rootY]++;
            newRoot = rootY;
            oldRoot = rootX;
        }
        
        // Merge the component nodes
        Set<Integer> newSet = componentNodes.get(newRoot);
        Set<Integer> oldSet = componentNodes.get(oldRoot);
        newSet.addAll(oldSet);
        
        // Recalculate beauty for the merged component
        int newBeauty = calculateBeauty(newSet);
        componentBeauty.put(newRoot, newBeauty);
        
        // Remove the old component
        componentNodes.remove(oldRoot);
        componentBeauty.remove(oldRoot);
        
        return true;
    }
    
    private int findBeauty(int u) {
        int root = find(u);
        return componentBeauty.get(root);
    }
    
    // Calculate beauty as the number of contiguous segments
    private int calculateBeauty(Set<Integer> nodes) {
        if (nodes.isEmpty()) return 0;
        
        List<Integer> sortedNodes = new ArrayList<>(nodes);
        Collections.sort(sortedNodes);
        
        int segments = 1;
        for (int i = 1; i < sortedNodes.size(); i++) {
            if (sortedNodes.get(i) != sortedNodes.get(i-1) + 1) {
                segments++;
            }
        }
        
        return segments;
    }
    
    public static void main(String[] args) {
        Q37 q37 = new Q37();
        
        // Test case 1: Original test
        int n1 = 2;
        int q1 = 1;
        int[][] queries1 = {{2, 1, 0}};
        int result1 = q37.sumOfBeauty(n1, q1, queries1);
        System.out.println(result1);
        
        // Test case 2: More comprehensive test
        Q37 q37_2 = new Q37();
        int n2 = 5;
        int q2 = 6;
        int[][] queries2 = {
            {1, 1, 2}, // Connect 1-2
            {2, 1, 0}, // Query beauty of component containing 1
            {1, 4, 5}, // Connect 4-5
            {2, 4, 0}, // Query beauty of component containing 4
            {1, 2, 4}, // Connect components {1,2} and {4,5}
            {2, 1, 0}  // Query beauty of merged component
        };
        int result2 = q37_2.sumOfBeauty(n2, q2, queries2);
        System.out.println(result2);
        
        // Expected: 
        // After {1,1,2}: component {1,2} has beauty 1 (one segment: 1-2)
        // Query beauty of 1: adds 1
        // After {1,4,5}: component {4,5} has beauty 1 (one segment: 4-5)  
        // Query beauty of 4: adds 1
        // After {1,2,4}: merged component {1,2,4,5} has beauty 2 (two segments: 1-2, 4-5)
        // Query beauty of 1: adds 2
        // Total: 1 + 1 + 2 = 4
    }
}