// https://www.geeksforgeeks.org/problems/row-with-max-1s0023/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=row-with-max-1s
package a2z.dza.binary_search.two_dimensional_arrays;

public class FindRowWithMaxNumOfOnes {
    public static int rowWithMax1s(int arr[][]) {

        int maxOnes = 0;
        int posOfMaxOnes = -1;

        for (int i = 0; i < arr.length; i++) {
            int low = 0, high = arr[0].length - 1;
            int mid = -1;
            while (low <= high) {
                mid = (high+low)/2;

                if (arr[i][mid] == 0) {
                    low = mid+1;
                } else {
                    high = mid-1;
                }
            }

            int ones;
            if (arr[i][mid] == 0) {
                ones = arr[i].length - 1 - mid;
            } else {
                ones = arr[i].length - mid;
            }

            if (low != arr[i].length && ones > maxOnes) {
                posOfMaxOnes = i;
                maxOnes = ones;
            }
        }


        return posOfMaxOnes;
    }
}
