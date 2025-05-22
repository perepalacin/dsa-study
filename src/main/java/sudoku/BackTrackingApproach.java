package sudoku;

public class BackTrackingApproach {

    public static boolean solve (int[][] grid, int row, int col) {
        if (row == 9) {
            return true;
        }

        if (grid[row][col] != 0) {
            if (col == 8) {
                return solve(grid, row + 1, 0);
            } else {
                return solve(grid, row, col + 1);
            }
        } else {
            for (int i = 1; i <= 9; i++) {
                if (Sudoku.isValidLocation(grid, row, col, i)) {
                    grid[row][col] = i;
                    if (col == 8) {
                        if (solve(grid, row + 1, 0)) {
                            return true;
                        }
                    } else {
                        if (solve(grid, row, col + 1)) {
                            return true;
                        }
                    }
                }
            }
        }
        grid[row][col] = 0;
        return false;
    }
}
