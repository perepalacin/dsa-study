package a2z.dza.binary_search.medium;

public class KthElementOfTwoSortedArrays {
    public static int kthElement(int a[], int b[], int k) {

        int n1 = a.length, n2 = b.length;

        if (n1 > n2) {
            return kthElement(b, a, k);
        }

        int low = Math.max(0, k - n2);
        int high = Math.min(k, n1);

        while (low <= high) {

            int mid1 = (high+low) / 2;
            int mid2 = n2-mid1;

            int l1 = ( mid1 -1 >= 0) ? a[mid1 -1] : Integer.MIN_VALUE;
            int r1 = ( mid1 > n1 -1 ) ? Integer.MAX_VALUE : a[mid1];

            int l2 = ( mid2 -1 >= 0) ? b[mid2 - 1] : Integer.MIN_VALUE;
            int r2 = ( mid2 > n2 -1 ) ? Integer.MAX_VALUE : b[mid2];

            if (l1 <= r2 && l2 <= r1) {
                return (Math.max(l1, l2) + Math.min(r1, r2));
            }

            if (l1 > r2) {
                high = mid1 - 1;
            } else {
                low = mid1 + 1;
            }
        }

        return 0;
    }
}