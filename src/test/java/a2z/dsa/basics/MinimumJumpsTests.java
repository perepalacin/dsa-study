package a2z.dsa.basics;

import a2z.dza.basics.MinimumJumps;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumJumpsTests {

    @Test
    public void Test1 () {
        assertEquals(MinimumJumps.calculateSteps(new int[] {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}), 3);
    }

    @Test
    public void Test2 () {
        assertEquals(MinimumJumps.calculateSteps(new int[] {1, 4, 3, 2, 6, 7}), 2);
    }

    @Test
    public void Test3 () {
        assertEquals(MinimumJumps.calculateSteps(new int[] {0, 10, 20}), -1);
    }
}
