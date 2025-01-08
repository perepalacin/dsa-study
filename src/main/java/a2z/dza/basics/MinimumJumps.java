// https://www.geeksforgeeks.org/problems/minimum-number-of-jumps-1587115620/1
package a2z.dza.basics;

public class MinimumJumps {

    public static int calculateSteps(int[] arr) {

        int currentGoal = arr.length - 1;
        int lastValidPosition = arr.length-1;
        int jumps = 0;
        while (currentGoal != 0) {
            for (int i = currentGoal; i >= 0; i--) {
                if (i + arr[i] >= currentGoal) {
                    lastValidPosition = i;
                }
            }
            if (currentGoal == lastValidPosition) {
                jumps = -1;
                break;
            } else {
                currentGoal = lastValidPosition;
                jumps ++;
            }
        }

        return jumps;
    }
}
