package sudoku;

import org.junit.Assert;
import org.junit.Test;

public class BackTrackingApproachTests {

    @Test
    public void Test1() {
        int[][] sudokuToSolve = Sudoku.getIncompleteSudoku(1);
        BackTrackingApproach.solve(sudokuToSolve, 0, 0);
        System.out.println(Sudoku.getStringRepresentation(sudokuToSolve));
        Assert.assertEquals(Sudoku.getStringRepresentation(Sudoku.getSolvedSudoku(1)), Sudoku.getStringRepresentation(sudokuToSolve));
    }

    @Test
    public void Test2() {
        int[][] sudokuToSolve = Sudoku.getIncompleteSudoku(2);
        BackTrackingApproach.solve(sudokuToSolve, 0, 0);
        Assert.assertEquals(Sudoku.getStringRepresentation(Sudoku.getSolvedSudoku(2)), Sudoku.getStringRepresentation(sudokuToSolve));
    }
}
