// https://leetcode.com/problems/median-of-two-sorted-arrays/description/
package a2z.dza.binary_search.medium;

public class MedianOfTwoSortedArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n1 = nums1.length, n2 = nums2.length;

        if (n1 > n2) {
            // we swap the arrays so that n1 is always the smallest!
            return findMedianSortedArrays(nums2, nums1);
        }

        int low = 0, high = n1;

        while (low <= high) {
            int mid1 = (high+low)/2;
            int mid2 = ((n1+n2+1)/2)-mid1;

            int l1 = ( mid1 == 0) ? Integer.MIN_VALUE : nums1[mid1 -1];
            int r1 = ( mid1 == n1 ) ? Integer.MAX_VALUE : nums1[mid1];

            int l2 = ( mid2 == 0) ? Integer.MIN_VALUE : nums2[mid2 - 1];
            int r2 = ( mid2 == n2 ) ? Integer.MAX_VALUE : nums2[mid2];

            if (l1 <= r2 && l2 <= r1) {
                // It is a valid partition
                if ((n1+n2) % 2 == 0) {
                    return ((double) (Math.max(l1, l2) + Math.min(r1, r2))) / 2.0;
                } else {
                    return Math.max(l1, l2);
                }
            }

            //It is not a valid partition because we took too many elements from n1
            if (l1 > r2) {
                high = mid1 - 1;
            } else {
                //The opposite
                low = mid1 + 1;
            }
        }

        return 0;
    }
}
