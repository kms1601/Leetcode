class Solution {
    public int maximalRectangle(char[][] matrix) {
        int N = matrix.length;
        int M = matrix[0].length;
        int[][] dp = new int[N][M];
        int maxArea = 0;

        for (int j = 0; j < M; j++) {
            dp[0][j] = matrix[0][j] - '0';
        }

        for (int i = 1; i < N; i++) {
            for (int j = 0; j < M; j++) {
                dp[i][j] = matrix[i][j] == '1' ? dp[i - 1][j] + 1 : 0;
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int minHeight = dp[i][j];
                for (int k = j; k < M; k++) {
                    minHeight = Math.min(minHeight, dp[i][k]);
                    maxArea = Math.max(maxArea, minHeight * (k - j + 1));
                }
            }
        }
        return maxArea;
    }
}