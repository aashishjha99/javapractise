import java.util.Arrays;

/*
 * 
 * Dynamic Programming Frog Jump
 */

public class FrogJump {

    static int solve(int n, int[] heights, int[] dp) {

        if (n == 0)
            return 0;

        if (dp[n] != -1)
            return dp[n];

        int jumpTwo = Integer.MAX_VALUE;
        int jumpOne = solve(n - 1, heights, dp) + Math.abs(heights[n] - heights[n - 1]);
        if (n > 1)
            jumpTwo = solve(n - 2, heights, dp) + Math.abs(heights[n] - heights[n - 2]);

        return dp[n] = Math.min(jumpOne, jumpTwo);

    }

    static int tabluation(int n, int[] height, int[] dp) {
        dp[0] = 0;
        for (int i = 1; i < n; i++) {
            int jumpTwo = Integer.MAX_VALUE;
            int jumpOne = dp[i - 1] + Math.abs(height[i] - height[i - 1]);
            if (i > 1)
                jumpTwo = dp[i - 2] + Math.abs(height[i] - height[i - 2]);

            dp[i] = Math.min(jumpOne, jumpTwo);
        }
        return dp[n - 1];
    }

    public static void main(String[] args) {

        int height[] = { 30, 10, 60, 10, 60, 50 };
        int n = height.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        System.out.println(solve(n - 1, height, dp));
        System.out.println(tabluation(n, height, dp));
    }
}
