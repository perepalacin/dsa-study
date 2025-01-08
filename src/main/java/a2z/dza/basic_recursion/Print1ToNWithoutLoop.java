// https://www.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=print-1-to-n-without-using-loops
package a2z.dza.basic_recursion;

public class Print1ToNWithoutLoop {
    public static void printNos(int n) {
        n++;
        if (n > 0) {
            printNos(n - 1);
            System.out.print(n + " ");
        }
    }
}
