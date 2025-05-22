package sudoku;

import java.util.HashSet;
import java.util.Set;

public class ConstrainPropagationWithPairsAndTriples {

    private static void removeCandidate (int[][] grid, Set<Integer>[][] candidates, int row, int col, int num) {
        for (int rowIndex = 0; rowIndex < 9; rowIndex++) {
            if (candidates[rowIndex][col].contains(num)) {
                candidates[rowIndex][col].remove(num);
                if (candidates[rowIndex][col].size() == 1) {
                    grid[rowIndex][col] = candidates[rowIndex][col].iterator().next();
                    removeCandidate(grid, candidates, rowIndex, col, num);
                }
            }
        }

        for (int colIndex = 0; colIndex < 9; colIndex++) {
            if (candidates[row][colIndex].contains(num)) {
                candidates[row][colIndex].remove(num);
                if (candidates[row][colIndex].size() == 1) {
                    grid[row][colIndex] = candidates[row][colIndex].iterator().next();
                    removeCandidate(grid, candidates, row, colIndex, num);
                }
            }
        }   

        for (int rowBlock = row/3; rowBlock < row/3 + 3; rowBlock++) {
            for (int colBlock = col/3; colBlock < col/3 + 3; colBlock++) {
                if (candidates[rowBlock][colBlock].contains(num)) {
                    candidates[rowBlock][colBlock].remove(num);
                    if (candidates[rowBlock][colBlock].size() == 1) {
                        grid[rowBlock][colBlock] = candidates[rowBlock][colBlock].iterator().next();
                        removeCandidate(grid, candidates, rowBlock, colBlock, num);
                    }
                }
            }
        }   
    }

    public static boolean solve (int[][] grid) {

        Set<Integer>[][] candidates = new HashSet[9][9]; 

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                candidates[row][col] = new HashSet<>();
                for (int i = 1; i <= 9; i++) {
                    if (grid[row][col] == 0 && Sudoku.isValidLocation(grid, row, col, i)) {
                        candidates[row][col].add(i);
                    }
                }
            }
        }

        
        boolean changed = true;

        while (changed) {
            changed = false;
            for (int row = 0; row < 9; row++) {
                for (int col = 0; col < 9; col++) {
                    if (candidates[row][col].size() == 1) {
                        grid[row][col] = candidates[row][col].iterator().next();
                        changed = true;
                        removeCandidate(grid, candidates, row, col, candidates[row][col].iterator().next());
                    }
                }
            }
        }

        return false;

    }

}
