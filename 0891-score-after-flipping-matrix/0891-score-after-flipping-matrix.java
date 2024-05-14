class Solution {
    public int matrixScore(int[][] grid) {
        int N = grid.length;
        int M = grid[0].length;

        for (int n = 0; n < N; n++) flipRow(grid[n], M);

        for (int m = 0; m < M; m++) flipCol(grid, N, m);

        int ans = 0;
        for (int n = 0; n < N; n++) ans += toDecimal(grid[n], M);

        return ans;
    }

    public void flipRow(int[] row, int M) {
        if (row[0] == 1) return; 
        for (int m = 0; m < M; m++) {
            row[m] ^= 1;
        }
    }

    public void flipCol(int[][] grid, int N, int m) {
        int sum = 0;
        for (int n = 0; n < N; n++) {
            sum += grid[n][m];
        }
        
        if (sum <= N / 2) {
            for (int n = 0; n < N; n++) {
                grid[n][m] ^= 1;
            }
        }
    }

    public int toDecimal(int[] bin, int M) {
        StringBuilder sb = new StringBuilder();
        for (int m = 0; m < M; m++) {
            sb.append(bin[m]);
        }
        return Integer.valueOf(sb.toString(), 2).intValue();
    }
}