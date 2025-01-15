package a2z.dsa.arrays.easy;

import a2z.dza.arrays.easy.MissingNumber;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MissingNumberTests {

    @Test
    public void Test1() {
        assertEquals(2, MissingNumber.missingNumber(new int[]{3,0,1}));
    }

    @Test
    public void Test2() {
        assertEquals(2, MissingNumber.missingNumber(new int[]{0,1}));
    }

    @Test
    public void Test3() {
        assertEquals(8, MissingNumber.missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
    }
}
