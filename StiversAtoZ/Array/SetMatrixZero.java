public class SetMatrixZero {
        public void setZeroes(int[][] arr) {
            int n = arr.length;
            int m = arr[0].length;
            int row [] = new int[n];
            int col [] = new int[m];
    
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (arr[i][j] == 0) {
                        row[i]=1;
                        col[j]=1;
                    }
                }
            }
    
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (row[i]==1||col[j]==1) {
                        arr[i][j] = 0;
                    }
                }
            }
        }
        public static void main(String[] args) {
            SetMatrixZero obj = new SetMatrixZero();
            int arr[][] = {{1,1,1},{1,0,1},{1,1,1}};
            obj.setZeroes(arr);
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
}
//time complexity is O(n*m) and space complexity is O(n+m) where n is the number of rows and m is the number of columns in the matrix.
