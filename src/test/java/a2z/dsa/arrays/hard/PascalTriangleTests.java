package a2z.dsa.arrays.hard;

import a2z.dza.arrays.hard.PascalTriangle;
import org.junit.Test;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class PascalTriangleTests {

    @Test
    public void Test1() {
        assertEquals(Stream.of(Stream.of(1).toList(), Stream.of(1,1).toList(),Stream.of(1,2,1).toList(),Stream.of(1,3,3,1).toList(),Stream.of(1,4,6,4,1).toList()).toList(), PascalTriangle.generate(5));
    }

    @Test
    public void Test2() {
        assertEquals(Stream.of(Stream.of(1).toList()).toList(), PascalTriangle.generate(1));
    }

}
