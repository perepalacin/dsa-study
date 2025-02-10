// https://www.geeksforgeeks.org/problems/square-root/0?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=square-root
package a2z.dza.binary_search.medium;

public class FindRootOfN {
    public static int floorSqrt(int n) {
        int left = 0, right = n;

        while (left <= right) {
            int mid = left + (right-left)/2;

            if (mid*mid == n || (mid*mid < n && ((mid+1)*(mid+1)) > n)) {
                return mid;
            } else if (mid*mid < n) {
                left = mid+1;
            } else {
                right = mid-1;
            }
        }

        return -1;
    }


    //Simpler solution:

//    int left = 1, right = m;
//
//        while (left <= right) {
//        int mid = (left+right)/2;
//
//        double val = Math.pow(mid, n);
//
//        if (val <= m) {
//            left = mid+1;
//        } else {
//            right =mid-1;
//        }
//    }
//
//    return right;
}
