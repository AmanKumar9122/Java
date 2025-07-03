class Q40 {
    int prefixSum[][];

    public NumMatrix(int[][] matrix) {
        // Initialize the matrix and preprocess the sums
        int m = matrix.length;
        if (m == 0) return;
        int n = matrix[0].length;
        
        // Create a prefix sum matrix
        this.prefixSum = new int[m + 1][n + 1];
        
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                prefixSum[i][j] = matrix[i - 1][j - 1] 
                    + prefixSum[i - 1][j] 
                    + prefixSum[i][j - 1] 
                    - prefixSum[i - 1][j - 1];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        // Calculate the sum of the region using the prefix sum matrix
        return prefixSum[row2 + 1][col2 + 1] 
            - prefixSum[row1][col2 + 1] 
            - prefixSum[row2 + 1][col1] 
            + prefixSum[row1][col1];
        
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */