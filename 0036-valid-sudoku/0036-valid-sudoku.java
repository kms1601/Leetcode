class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> row = new HashSet<>();
        Set<Character> col = new HashSet<>();
        Set<Character> grid = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char curRow = board[i][j];
                char curCol = board[j][i];
                char curGrid = board[((i / 3) * 3) + (j / 3)][((i % 3) * 3) + (j % 3)];
                if (row.contains(curRow)) {
                    return false;
                } else if (curRow != '.') {
                    row.add(curRow);
                }

                if (col.contains(curCol)) {
                    return false;
                } else if (curCol != '.') {
                    col.add(curCol);
                }

                if (grid.contains(curGrid)) {
                    return false;
                } else if (curGrid != '.') {
                    grid.add(curGrid);
                }
            }
            row = new HashSet<>();
            col = new HashSet<>();
            grid = new HashSet<>();
        }
        return true;
    }
}