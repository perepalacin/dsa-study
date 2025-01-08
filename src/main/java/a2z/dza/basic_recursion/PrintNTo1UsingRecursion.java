// https://www.geeksforgeeks.org/problems/print-n-to-1-without-loop/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=print-n-to-1-without-loop
package a2z.dza.basic_recursion;

public class PrintNTo1UsingRecursion {
    public static void printNos(int n) {
        if (n != 0) {
            System.out.print(n + " ");
            printNos(n-1);
        }
    }
}
