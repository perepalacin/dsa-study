package sudoku;

public class Sudoku {

    private static int[][] incompleteSudoku = {
            {0, 0, 7, 8, 6, 1, 0, 0, 0},
            {0, 0, 8, 0, 0, 3, 0, 0, 0},
            {5, 6, 0, 0, 9, 0, 0, 1, 0},
            {1, 0, 0, 0, 7, 0, 0, 8, 5},
            {0, 0, 0, 3, 4, 5, 0, 0, 0},
            {6, 3, 0, 0, 1, 0, 0, 0, 7},
            {0, 5, 0, 0, 2, 0, 0, 9, 8},
            {0, 0, 0, 6, 0, 0, 5, 0, 0},
            {0, 0, 0, 5, 3, 7, 1, 0, 0},
    };

    private static int[][] solvedSudoku = {
            {9, 4, 7, 8, 6, 1, 2, 5, 3},
            {2, 1, 8, 4, 5, 3, 6, 7, 9},
            {5, 6, 3, 7, 9, 2, 8, 1, 4},
            {1, 9, 4, 2, 7, 6, 3, 8, 5},
            {7, 8, 2, 3, 4, 5, 9, 6, 1},
            {6, 3, 5, 9, 1, 8, 4, 2, 7},
            {3, 5, 6, 1, 2, 4, 7, 9, 8},
            {4, 7, 1, 6, 8, 9, 5, 3, 2},
            {8, 2, 9, 5, 3, 7, 1, 4, 6},
    };

    private static int[][] incompleteSudoku2 = {
            {0, 0, 8, 0, 0, 5, 9, 0, 0},
            {4, 2, 9, 0, 6, 0, 1, 8, 9},
            {5, 0, 1, 0, 0, 8, 0, 7, 4},
            {6, 1, 0, 0, 4, 9, 8, 0, 0},
            {0, 5, 0, 0, 0, 0, 6, 0, 9},
            {9, 0, 4, 0, 0, 2, 0, 0, 1},
            {1, 0, 6, 0, 8, 0, 7, 5, 0},
            {7, 4, 0, 0, 0, 0, 0, 1, 0},
            {0, 0, 0, 0, 0, 7, 4, 9, 6},
    };
    
    private static int[][] solvedSudoku2 = {
            {3, 7, 8, 4, 1, 5, 9, 6, 2},
            {4, 2, 9, 7, 6, 3, 1, 8, 9},
            {5, 6, 1, 9, 2, 8, 3, 7, 4},
            {6, 1, 3, 5, 4, 9, 8, 2, 7},
            {2, 5, 7, 8, 3, 1, 6, 4, 9},
            {9, 8, 4, 6, 7, 2, 5, 3, 1},
            {1, 9, 6, 2, 8, 4, 7, 5, 3},
            {7, 4, 5, 3, 9, 6, 2, 1, 8},
            {8, 3, 2, 1, 5, 7, 4, 9, 6}
    };

    public static int[][] getIncompleteSudoku (int num) {
        if (num == 1) {
            return incompleteSudoku;
        }
        return incompleteSudoku2;
    }

    public static int[][] getSolvedSudoku (int num) {
        if (num == 1) {
            return solvedSudoku;
        }
        return solvedSudoku2;
    }


    public static String getStringRepresentation(int[][] grid) {
        StringBuilder output = new StringBuilder();

        output.append("-------------------------\n");

        for (int row = 0; row < 9; row++) {
            if (row > 0 && row % 3 == 0) {
                output.append("-------------------------\n");
            }

            for (int col = 0; col < 9; col++) {
                if (col % 3 == 0) {
                    output.append("| ");
                }
                output.append(grid[row][col] == 0 ? " " : grid[row][col]).append(" ");
            }
            output.append("|\n"); // End of row, add right border and new line
        }

        output.append("-------------------------\n");

        return output.toString();
    }

    private static boolean isValidRow (int[][] grid, int row, int input) {
        for (int i = 0; i < 9; i++) {
            if (grid[row][i] == input) {
                return false;
            }
        }
        return true;
    }

    private static boolean isValidCol (int[][] grid, int col, int input) {
        for (int i = 0; i < 9; i++) {
            if (grid[i][col] == input) {
                return false;
            }
        }
        return true;
    }

    private static boolean isValidBlock (int[][] grid, int row, int col, int input) {
        int rowBlock =  row/3, colBlock = col/3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (input == grid[(rowBlock*3) + i][(colBlock*3) + j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isValidLocation (int[][] grid, int row, int col, int input) {
        return isValidCol(grid, col, input) && isValidRow(grid, row, input) && isValidBlock(grid, row, col, input);
    }

}
