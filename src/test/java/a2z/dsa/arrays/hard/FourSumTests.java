package a2z.dsa.arrays.hard;

import a2z.dza.arrays.hard.FourSum;
import org.junit.Test;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class FourSumTests {

    @Test
    public void Test1() {
        assertEquals(Stream.of(Stream.of(-2,-1,1,2).toList(), Stream.of(-2,0,0,2).toList(), Stream.of(-1,0,0,1).toList()).toList(), FourSum.fourSum(new int[] {1,0,-1,0,-2,2}, 0));
    }

    @Test
    public void Test2() {
        assertEquals(Stream.of(Stream.of(2,2,2,2).toList()).toList(), FourSum.fourSum(new int[] {2,2,2,2,2}, 8));
    }

    @Test
    public void Test3() {
        assertEquals(Stream.of().toList(), FourSum.fourSum(new int[] {1000000000,1000000000,1000000000,1000000000}, -294967296));
    }
}
