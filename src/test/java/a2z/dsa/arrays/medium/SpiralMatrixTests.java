package a2z.dsa.arrays.medium;

import a2z.dza.arrays.medium.ArrayLeaders;
import a2z.dza.arrays.medium.SpiralMatrix;
import org.junit.Test;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class SpiralMatrixTests {

    @Test
    public void Test1(){
        assertEquals(Stream.of(1,2,3,6,9,8,7,4,5).toList(), SpiralMatrix.spiralOrder(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
    }

    @Test
    public void Test2(){
        assertEquals(Stream.of(1,2,3,4,8,12,11,10,9,5,6,7).toList(), SpiralMatrix.spiralOrder(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}}));
    }

}
