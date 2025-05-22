package sudoku;

import org.junit.Assert;
import org.junit.Test;

public class ConstrainPropagationWithPairsAndTriplesTests {

    @Test
    public void Test1() {
        int[][] sudokuToSolve = Sudoku.getIncompleteSudoku(1);
        ConstrainPropagationWithPairsAndTriples.solve(sudokuToSolve);
        System.out.println(Sudoku.getStringRepresentation(sudokuToSolve));
        Assert.assertEquals(Sudoku.getStringRepresentation(Sudoku.getSolvedSudoku(1)), Sudoku.getStringRepresentation(sudokuToSolve));
    }

    @Test
    public void Test2() {
        int[][] sudokuToSolve = Sudoku.getIncompleteSudoku(2);
        ConstrainPropagationWithPairsAndTriples.solve(sudokuToSolve);
        Assert.assertEquals(Sudoku.getStringRepresentation(Sudoku.getSolvedSudoku(2)), Sudoku.getStringRepresentation(sudokuToSolve));
    }
}
