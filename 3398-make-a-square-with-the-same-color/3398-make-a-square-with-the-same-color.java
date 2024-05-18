class Solution {
    public boolean canMakeSquare(char[][] grid) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (isSquare(grid, i, j)) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean isSquare(char[][] grid, int r, int c) {
        int countWhite = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (grid[r + i][j + c] == 'W') {
                    countWhite++;
                }
            }
        }

        return countWhite != 2;
    }
}