import java.lang.reflect.Array;
import java.util.Arrays;

public class MaxmSumOfAdjacentSum {

    /*
     * Recursion Technique
     */
    static int maximumSumOfAdjacentNumber(int n, int[] arr) {

        if (n == 0)
            return arr[0];
        if (n < 0)
            return 0;

        int pick = arr[n] + maximumSumOfAdjacentNumber(n - 2, arr);
        int notPick = 0 + maximumSumOfAdjacentNumber(n - 1, arr);
        return Math.max(pick, notPick);

    }

    /*
     * Memorization
     */

    static int memorizationTec(int n, int[] arr, int[] dp) {

        if (n < 0)
            return 0;
        if (n == 0)
            return arr[n];

        if (dp[n] != -1)
            return dp[n];
        int pick = arr[n] + memorizationTec(n - 2, arr, dp);
        int nonPick = 0 + memorizationTec(n - 1, arr, dp);

        return dp[n] = Math.max(pick, nonPick);
    }

    /*
     * Tabluation
     */

    static int tabluation(int n, int[] arr, int[] dp) {
        dp[0] = arr[0];

        for (int i = 1; i < n; i++) {
            int pick = arr[i];
            if (i > 1)
                pick += dp[i - 2];
            int nonPick = 0 + dp[i - 1];

            dp[i] = Math.max(pick, nonPick);
        }
        return dp[n - 1];
    }

    public static void main(String[] args) {

        int[] arr = { 2, 1, 4, 9 };
        int n = arr.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        System.out.println(maximumSumOfAdjacentNumber(n - 1, arr));
        System.out.println(memorizationTec(n - 1, arr, dp));
        System.out.println(tabluation(n, arr, dp));

    }
}
