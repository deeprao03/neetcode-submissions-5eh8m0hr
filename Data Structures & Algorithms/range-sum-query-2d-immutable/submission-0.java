class NumMatrix {
    int[][]arr;
    public NumMatrix(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        arr = new int[n+1][m+1];
        for(int i=0;i<n;i++){
            int prefix = 0;
            for(int j=0;j<m;j++){
                prefix += matrix[i][j];
                int above = arr[i][j+1];
                arr[i+1][j+1] = prefix+above;
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int ans = arr[row2+1][col2+1];
        ans -= arr[row1][col2+1];
        ans -= arr[row2+1][col1];
        ans += arr[row1][col1];
        return ans;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */