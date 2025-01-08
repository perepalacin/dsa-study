// https://www.geeksforgeeks.org/problems/print-gfg-n-times/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=print-gfg-n-times
package a2z.dza.basic_recursion;

public class PrintNameNTimes {
    public static void printNameNTimes(int n) {
        if (n == 0) {
            return;
        }
        printNameNTimes(n - 1);
        System.out.print("GFG ");
    }
}
