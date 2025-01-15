package a2z.dsa.arrays.easy;

import a2z.dza.arrays.easy.MaxConsecutiveOnes;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxConsecutiveOnesTest {

    @Test
    public void Test1() {
        assertEquals(3, MaxConsecutiveOnes.findMaxConsecutiveOnes(new int[]{1,1,0,0,1,1,1}));
    }

    @Test
    public void Test2() {
        assertEquals(2, MaxConsecutiveOnes.findMaxConsecutiveOnes(new int[]{1,0,1,1,0,1}));
    }
}
