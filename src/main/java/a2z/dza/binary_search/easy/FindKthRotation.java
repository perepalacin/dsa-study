// https://www.geeksforgeeks.org/problems/rotation4723/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=rotation
package a2z.dza.binary_search.easy;

import java.util.List;

public class FindKthRotation {
    public static int findKRotation(List<Integer> arr) {
        int left = 0, right = arr.size()-1;
        int min = Integer.MAX_VALUE;
        int indexOfMin = 0;
        while (left <= right) {
            int mid = left + (right-left) /2;

            //Left part is sorted
            if (arr.get(left) <= arr.get(mid)) {
                // we check if the smallest num of the array is smaller than min
                if (arr.get(left) < min) {
                    min = arr.get(left);
                    indexOfMin = left;
                }
                // we analyse the right sie
                left = mid+1;
            } else {
                // right side is sorted
                if (arr.get(mid) < min) {
                    //We take the smallest side of the right part
                    min = arr.get(mid);
                    indexOfMin = mid;
                }
                right = mid-1;
            }
        }
        return indexOfMin;
    }
}
