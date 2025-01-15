package a2z.dza.arrays.easy;

import java.util.ArrayList;

public class UnionOfSortedArrays {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0;
        int j = 0;
        int lastAdd = -1;
        while (i < a.length && j < b.length ) {
            if (a[i] == b[j]) {
                if (lastAdd != a[i]) {
                    result.add(a[i]);
                    lastAdd = a[i];
                }
                i++;
                j++;
            } else if (a[i] < b[j]) {
                if (lastAdd != a[i]) {
                    result.add(a[i]);
                    lastAdd = a[i];
                }
                i++;
            } else {
                if (lastAdd != b[j]) {
                    result.add(b[j]);
                    lastAdd = b[j];
                }
                j++;
            }
        }

        for (; i < a.length; i++) {
            if (a[i] != lastAdd) {
                result.add(a[i]);
                lastAdd = a[i];
            }
        }

        for (; j < b.length; j++) {
            if (b[j] != lastAdd) {
                result.add(b[j]);
                lastAdd = b[j];
            }

        }

        return result;
    }
}
