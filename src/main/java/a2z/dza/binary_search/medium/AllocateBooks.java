// https://www.naukri.com/code360/problems/allocate-books_1090540?utm_source=youtube&utm_medium=affiliate&utm_campaign=codestudio_Striver_BinarySeries
package a2z.dza.binary_search.medium;

import java.util.ArrayList;

public class AllocateBooks {
    public static int findPages(ArrayList<Integer> arr, int n, int m) {

        if (n < m) {
            return -1;
        }
        int low = Integer.MAX_VALUE, high = 0, max = Integer.MIN_VALUE;
        for (int i : arr) {
            low = Math.min(low, i);
            max = Math.max(max, i);
            high += i;
        }

        if (n == m) {
            return max;
        }

        while (low <= high) {
            int mid = (low+high)/2;

            int students = 1;
            int readPages = 0;
            for (int pages : arr) {
                if (readPages + pages >= mid) {
                    students++;
                    readPages = 0;
                }
                readPages += pages;
            }

            if (students > m) {
                low = mid+1;
            } else {
                high = mid-1;
            }
        }

        if (high == n-1) {
            return -1;
        } else {
            return high;
        }
    }
}
