// https://leetcode.com/problems/merge-sorted-array/solutions/3436053/beats-100-best-c-java-python-and-javascript-solution-two-pointer-stl/
package a2z.dza.arrays.hard;

public class MergeSortedArrays {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // O(m+n)log(m+n) solution:
//            for (int j = 0, i = m; j < n; j++) {
//                nums1[i] = nums2[j];
//                i++;
//            }
//            Arrays.sort(nums1);

//        // My solution, I don't quite like the code
//        if (m == 0) {
//            if (n >= 0) System.arraycopy(nums2, 0, nums1, 0, n);
//        } else if ( n == 0) {
//            return;
//        } else {
//            int indexOne = m-1, indexTwo = n-1;
//            for (int i = nums1.length -1; i >= 0; i--) {
//                if (nums2[indexTwo] >= nums1[indexOne]) {
//                    nums1[i] = nums2[indexTwo];
//                    indexTwo--;
//                } else {
//                    nums1[i] = nums1[indexOne];
//                    indexOne--;
//                }
//
//                if (indexOne < 0) {
//                    i--;
//                    while (indexTwo >= 0 && i >= 0) {
//                        nums1[i] = nums2[indexTwo];
//                        indexTwo--;
//                        i--;
//                    }
//                    break;
//                }
//                if (indexTwo < 0) {
//                    break;
//                }
//            }
//        }

        //KISS approach:
        int indexOne = m-1, indexTwo = n-1, k = m+n-1;
        while (indexTwo >= 0) {
            if (indexOne >= 0 && nums1[indexOne] > nums2[indexTwo]) {
                nums1[k--] = nums1[indexOne--];
            } else {
                nums1[k--] = nums2[indexTwo--];
            }
        }
    }
}
