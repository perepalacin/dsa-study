package a2z.dsa.binary_search.two_dimensional_arrays;

import a2z.dza.binary_search.two_dimensional_arrays.SearchIn2DMatrix;
import org.junit.Assert;
import org.junit.Test;

public class SearchIn2DMatrixTests {


    @Test
    public void Test1() {
        Assert.assertTrue(SearchIn2DMatrix.searchMatrix(new int[][]{new int[]{1,3,5,7}, new int[]{10,11,16,20}, new int[]{23,30,34,60}}, 3));
    }

    @Test
    public void Test2() {
        Assert.assertFalse(SearchIn2DMatrix.searchMatrix(new int[][]{new int[]{1,3,5,7}, new int[]{10,11,16,20}, new int[]{23,30,34,60}}, 13));
    }

    @Test
    public void Test3() {
        Assert.assertFalse(SearchIn2DMatrix.searchMatrix(new int[][]{new int[]{1,1}}, 0));
    }

    @Test
    public void Test4() {
        Assert.assertTrue(SearchIn2DMatrix.searchMatrix(new int[][]{new int[]{1}, new int[]{3}}, 3));
    }

}
