package a2z.dsa.arrays.easy;

import a2z.dza.arrays.easy.CheckIfArrayIsSorted;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CheckIfArrayIsSortedTests {

    @Test
    public void Test1() {
        int[] arr = {3,4,5,1,2};
        assertTrue(CheckIfArrayIsSorted.check(arr));
    }

    @Test
    public void Test2() {
        int[] arr = {2,1,3,4};
        assertFalse(CheckIfArrayIsSorted.check(arr));
    }

    @Test
    public void Test3() {
        int[] arr = {1,2,3};
        assertTrue(CheckIfArrayIsSorted.check(arr));
    }

    @Test
    public void Test4() {
        int[] arr = {2, 1};
        assertTrue(CheckIfArrayIsSorted.check(arr));
    }

    @Test
    public void Test5() {
        int[] arr = {3, 5 , 1, 2, 4};
        assertFalse(CheckIfArrayIsSorted.check(arr));
    }

    @Test
    public void Test6() {
        int[] arr = {6, 10, 6};
        assertTrue(CheckIfArrayIsSorted.check(arr));
    }



}
