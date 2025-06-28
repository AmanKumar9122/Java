class Q29 {
    int find(int par[], int x) {
        // add code here.
        if (par[x] == x) {
            return x;
        }
        // Path compression
        par[x] = find(par, par[x]);
        return par[x];
    }

    void unionSet(int par[], int x, int z) {
        // add code here.
        int xRoot = find(par, x);
        int zRoot = find(par, z);
        if (xRoot != zRoot) {
            par[xRoot] = zRoot;
        }
    }
    public static void main(String[] args) {
        Q29 q = new Q29();
        int par[] = new int[10];
        for (int i = 0; i < 10; i++) {
            par[i] = i; // Initialize each element to be its own parent
        }

        // Example usage
        q.unionSet(par, 1, 2);
        q.unionSet(par, 2, 3);
        System.out.println(q.find(par, 1)); // Should print the root of the set containing 1
        System.out.println(q.find(par, 2)); // Should print the root of the set containing 2
        System.out.println(q.find(par, 3)); // Should print the root of the set containing 3
    }
}

