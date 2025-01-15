// https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
package a2z.dza.arrays.easy;

public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {

        //Faster approach:
        int indexOfComparison = 0;
        int numOfUniques = 1;
        int indexOfPlacing = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[indexOfComparison] == nums[i]) {
                nums[i] = 101;
            } else {
                numOfUniques++;
                indexOfComparison = indexOfPlacing;
                int temp = nums[i];
                nums[i] = nums[indexOfPlacing];
                nums[indexOfPlacing] = temp;
                indexOfPlacing++;
            }
        }
        return numOfUniques;
    }
//        //Simple but slow approach:
//        int indexOfComparison = 0;
//        int numOfUniques = 1;
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[indexOfComparison] == nums[i]) {
//                nums[i] = 101;
//            } else {
//                numOfUniques++;
//                indexOfComparison = i;
//
//            }
//        }
//
//        bubbleSort(nums);
//        return numOfUniques;
//    }
//
//    public static void bubbleSort(int[] nums) {
//        int swaps = 0;
//        for (int i = nums.length-1; i > 0; i--) {
//            if (nums[i] != 101) {
//                if (nums[i] < nums[i-1]) {
//                    int temp = nums[i-1];
//                    nums[i-1] = nums[i];
//                    nums[i] = temp;
//                    swaps++;
//                }
//            }
//        }
//        if (swaps > 0) {
//            bubbleSort(nums);
//        }
//    }
}
