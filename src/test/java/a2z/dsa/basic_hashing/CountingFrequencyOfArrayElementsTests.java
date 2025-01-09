package a2z.dsa.basic_hashing;

import a2z.dza.basic_hashing.CountingFrequencyOfArrayElements;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CountingFrequencyOfArrayElementsTests {

    @Test
    public void Test1() {
        List<Integer> result = Arrays.asList(0, 2, 2, 0, 1);
        Assert.assertEquals(result, CountingFrequencyOfArrayElements.frequencyCount(new int[] {2, 3, 2,3, 5}));
    }

    @Test
    public void Test2() {
        List<Integer> result = Arrays.asList(0,0,4,0);
        Assert.assertEquals(result, CountingFrequencyOfArrayElements.frequencyCount(new int[] {3,3,3,3}));
    }

    @Test
    public void Test3() {
        List<Integer> result = Arrays.asList(1);
        Assert.assertEquals(result, CountingFrequencyOfArrayElements.frequencyCount(new int[] {1}));
    }
}
