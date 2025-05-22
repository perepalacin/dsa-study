package sudoku;

import java.util.ArrayList;
import java.util.List;

public class ConstraintPropagationApproach {

    public static boolean solve (int[][] grid) {

        boolean madeProgress;

        do {
            madeProgress = false;

            for (int row = 0; row < 9; row++) {
                for (int col = 0; col < 9; col++) {
                    if (grid[row][col] == 0) {
                        List<Integer> possibleCandidates = new ArrayList<>();
                        for (int i = 1; i <= 9; i++) {
                            if (Sudoku.isValidLocation(grid, row, col, i)) {
                                possibleCandidates.add(i);
                            }
                        }
                        if (possibleCandidates.size() == 1) {
                            grid[row][col] = possibleCandidates.getFirst();
                            madeProgress = true;
                        } else if (possibleCandidates.isEmpty()) {
                            return false;
                        }
                    }
                }
            }

            for (int row = 0; row < 9; row++) {
                for (int i = 1; i <= 9; i++) {
                    int countPossiblePositions = 0;
                    int foundCol = -1;
                    for (int col = 0; col < 9; col++) {
                        if (grid[row][col] == 0) {
                            if (Sudoku.isValidLocation(grid, row, col, i)) {
                                countPossiblePositions++;
                                foundCol = col;
                            }
                        }
                    }
                    if (countPossiblePositions == 1) {
                        grid[row][foundCol] = i;
                        madeProgress = true;
                    } else if (countPossiblePositions == 0) {
                        return false;
                    }
                }
            }

            for (int col = 0; col < 9; col++) {
                for (int i = 1; i <= 9; i++) {
                    int countPossiblePositions = 0;
                    int foundRow = -1;
                    for (int row = 0; row < 9; row++) {
                        if (grid[row][col] == 0) {
                            if (Sudoku.isValidLocation(grid, row, col, i)) {
                                countPossiblePositions++;
                                foundRow = row;
                            }
                        }
                    }
                    if (countPossiblePositions == 1) {
                        grid[foundRow][col] = i;
                        madeProgress = true;
                    } else if (countPossiblePositions == 0) {
                        return false;
                    }
                }
            }

            for (int rowBlock = 0; rowBlock <= 2; rowBlock++) {
                for (int colBlock = 0; colBlock <= 2; colBlock++) {
                    for (int i = 1; i <= 9; i++) {
                        int count = 0;
                        int rowIndex = -1;
                        int colIndex = -1;
                        for (int row = rowBlock * 3; row < rowBlock * 3 + 3; row++) {
                            for (int col = colBlock * 3; col < colBlock * 3 + 3; col++) {
                                if (grid[row][col] == 0) {
                                    if (Sudoku.isValidLocation(grid, row, col, i)) {
                                        count++;
                                        rowIndex = row;
                                        colIndex = col;
                                    }
                                }
                            }
                        }
                        if (count == 1) {
                            grid[rowIndex][colIndex] = i;
                            madeProgress = true;
                        } else if (count == 0) {
                            return false;
                        }
                    }
                }
            }

        } while (madeProgress);

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (grid[row][col] == 0) {
                    return false;
                }
            }
        }

        return true;
    }

}
