// https://www.geeksforgeeks.org/problems/find-nth-root-of-m5843/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=find-nth-root-of-m
package a2z.dza.binary_search.medium;

public class FindMRootOfN
{
    public static int nthRoot(int n, int m) {
        int left = 1, right = m;
        while (left <= right) {
            int mid = (left+right)/2;
            double val = Math.pow(mid, n);
            if (val <= m) {
                left = mid+1;
            } else {
                right =mid-1;
            }
        }
        if (Math.pow(right, n) == m) {
            return right;
        } else {
            return -1;
        }
    }
}
