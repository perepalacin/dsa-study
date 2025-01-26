package a2z.dsa.arrays.hard;

import a2z.dza.arrays.hard.FourSum;
import a2z.dza.arrays.hard.MissingAndRepeatedNumber;
import org.junit.Test;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class MissingAndRepeatedNumberTests {

    @Test
    public void Test1() {
        assertEquals(Stream.of(2,1).toList(), MissingAndRepeatedNumber.findTwoElement(new int[] {2,2}));
    }

    @Test
    public void Test2() {
        assertEquals(Stream.of(3,2).toList(), MissingAndRepeatedNumber.findTwoElement(new int[] {1,3,3}));
    }

    @Test
    public void Test3() {
        assertEquals(Stream.of(1,5).toList(), MissingAndRepeatedNumber.findTwoElement(new int[] {4,3,6,2,1,1}));
    }
}
