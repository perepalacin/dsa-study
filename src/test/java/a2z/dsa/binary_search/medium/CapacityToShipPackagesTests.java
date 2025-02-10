package a2z.dsa.binary_search.medium;

import a2z.dza.binary_search.medium.CapacityToShipPackages;
import org.junit.Assert;
import org.junit.Test;

public class CapacityToShipPackagesTests {

    @Test
    public void Test1(){
        Assert.assertEquals(15, CapacityToShipPackages.shipWithinDays(new int[]{1,2,3,4,5,6,7,8,9,10}, 5));
    }

    @Test
    public void Test2(){
        Assert.assertEquals(6, CapacityToShipPackages.shipWithinDays(new int[]{3,2,2,4,1,4}, 3));
    }

    @Test
    public void Test3(){
        Assert.assertEquals(3, CapacityToShipPackages.shipWithinDays(new int[]{1,2,3,1,1}, 4));
    }

}
