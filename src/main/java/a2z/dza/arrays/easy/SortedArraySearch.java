// https://www.geeksforgeeks.org/problems/who-will-win-1587115621/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=who-will-win
package a2z.dza.arrays.easy;

public class SortedArraySearch {
    public static boolean searchInSorted(int arr[], int k) {
        // Your code here
        for (int j : arr) {
            if (j == k) {
                return true;
            }
        }
        return false;
    }
}
