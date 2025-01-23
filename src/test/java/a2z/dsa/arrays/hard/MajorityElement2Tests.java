package a2z.dsa.arrays.hard;

import a2z.dza.arrays.hard.MajorityElement2;
import org.junit.Test;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class MajorityElement2Tests {

    @Test
    public void Test1(){
        assertEquals(Stream.of(3).toList(), MajorityElement2.majorityElement(new int[]{3,2,3}));
    }

    @Test
    public void Test2(){
        assertEquals(Stream.of(1).toList(), MajorityElement2.majorityElement(new int[]{1}));
    }

    @Test
    public void Test3(){
        assertEquals(Stream.of(1,2).toList(), MajorityElement2.majorityElement(new int[]{1, 2}));
    }

    @Test
    public void Test4() {
        assertEquals(Stream.of().toList(), MajorityElement2.majorityElement(new int[]{1,2,1,2,1,2,3,4,5}));
    }

    @Test
    public void Test5() {
        assertEquals(Stream.of(1,2).toList(), MajorityElement2.majorityElement(new int[]{1,2,1,2,1,2,3,4}));
    }

}
