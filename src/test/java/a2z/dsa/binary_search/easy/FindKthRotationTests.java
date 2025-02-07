package a2z.dsa.binary_search.easy;

import a2z.dza.binary_search.easy.FindKthRotation;
import org.junit.Assert;
import org.junit.Test;

import java.util.stream.Stream;

public class FindKthRotationTests {

    @Test
    public void Test1() {
        Assert.assertEquals(1, FindKthRotation.findKRotation(Stream.of(5,1,2,3,4).toList()));
    }

    @Test
    public void Test2() {
        Assert.assertEquals(0, FindKthRotation.findKRotation(Stream.of(1,2,3,4,5).toList()));
    }

    @Test
    public void Test3() {
        Assert.assertEquals(1, FindKthRotation.findKRotation(Stream.of(39, 6 ,11, 14, 18, 36, 37, 38).toList()));
    }
}
