package a2z.dsa.arrays.hard;

import a2z.dza.arrays.hard.PascalTriangle;
import a2z.dza.arrays.hard.ThreeSum;
import org.junit.Test;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class ThreeSumTests {

    @Test
    public void Test1() {
        assertEquals(Stream.of(Stream.of(-1,-1,2).toList(), Stream.of(-1,0,1).toList()).toList(), ThreeSum.threeSum(new int[] {-1,0,1,2,-1,-4}));
    }

    @Test
    public void Test2() {
        assertEquals(Stream.of().toList(), ThreeSum.threeSum(new int[] {0,1,1}));
    }

    @Test
    public void Test3() {
        assertEquals(Stream.of(Stream.of(0,0,0).toList()).toList(), ThreeSum.threeSum(new int[] {0,0,0}));
    }

    @Test
    public void Test4() {
        assertEquals(Stream.of(Stream.of(0,0,0).toList()).toList(), ThreeSum.threeSum(new int[] {0,0,0,0}));
    }

    @Test
    public void Test5() {
        assertEquals(Stream.of(Stream.of(-1,0,1).toList()).toList(), ThreeSum.threeSum(new int[] {-1,0,1,0}));
    }

    @Test
    public void Test6() {
        assertEquals(Stream.of(Stream.of(-2,0,2).toList()).toList(), ThreeSum.threeSum(new int[] {-2,0,0,2,2}));
    }

}
