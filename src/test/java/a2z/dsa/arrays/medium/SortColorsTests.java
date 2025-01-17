package a2z.dsa.arrays.medium;

import a2z.dza.arrays.medium.SortColors;
import org.junit.Assert;
import org.junit.Test;

public class SortColorsTests {

    @Test
    public void Test1() {
        int[] nums = new int[]{2,0,2,1,1,0};
        SortColors.sortColors(nums);
        Assert.assertArrayEquals(new int[]{0,0,1,1,2,2}, nums);
    }


    @Test
    public void Test2() {
        int[] nums = new int[]{2,0,1};
        SortColors.sortColors(nums);
        Assert.assertArrayEquals(new int[]{0,1,2}, nums);
    }

    @Test
    public void Test3() {
        int[] nums = new int[]{0};
        SortColors.sortColors(nums);
        Assert.assertArrayEquals(new int[]{0}, nums);
    }

    @Test
    public void Test4() {
        int[] nums = new int[]{2,1,2};
        SortColors.sortColors(nums);
        Assert.assertArrayEquals(new int[]{1,2,2}, nums);
    }

    @Test
    public void Test5() {
        int[] nums = new int[]{0,2,2,2,0,2,1,1};
        SortColors.sortColors(nums);
        Assert.assertArrayEquals(new int[]{0,0,1,1,2,2,2,2}, nums);
    }
}
