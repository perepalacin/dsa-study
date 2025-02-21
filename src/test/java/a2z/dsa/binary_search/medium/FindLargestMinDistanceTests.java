package a2z.dsa.binary_search.medium;

import a2z.dza.binary_search.medium.FindLargestMinDistance;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class FindLargestMinDistanceTests {

    @Test
    public void Test1() {
        ArrayList<Integer> logs = new ArrayList<>();
        logs.add(7);
        logs.add(2);
        logs.add(5);
        logs.add(10);
        logs.add(8);
        Assert.assertEquals(18, FindLargestMinDistance.findLargestMinDistance(logs, 2));
    }

    @Test
    public void Test2() {
        ArrayList<Integer> logs = new ArrayList<>();
        logs.add(1);
        logs.add(2);
        logs.add(3);
        logs.add(4);
        logs.add(5);
        Assert.assertEquals(9, FindLargestMinDistance.findLargestMinDistance(logs, 2));
    }
}
