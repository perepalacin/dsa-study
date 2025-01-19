package a2z.dsa.arrays.medium;

import a2z.dza.arrays.medium.ArrayLeaders;
import org.junit.Test;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class ArrayLeadersTests {

    @Test
    public void Test1(){
        assertEquals(Stream.of(17, 5, 2).toList(), ArrayLeaders.leaders(new int[]{16, 17, 4, 3, 5, 2}));
    }

    @Test
    public void Test2(){
        assertEquals(Stream.of(10, 4, 4, 1).toList(), ArrayLeaders.leaders(new int[]{10, 4, 2, 4, 1}));
    }

    @Test
    public void Test3(){
        assertEquals(Stream.of(40).toList(), ArrayLeaders.leaders(new int[]{5, 10, 20, 40}));
    }

    @Test
    public void Test4(){
        assertEquals(Stream.of(30, 10, 10, 5).toList(), ArrayLeaders.leaders(new int[]{30, 10, 10, 5}));
    }

}
