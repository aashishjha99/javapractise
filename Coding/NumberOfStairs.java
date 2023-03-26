public class NumberOfStairs {

    /*
     * Memorization : TC O(N) , SC O(N) + O(N)
     * call stack + arrray space
     */

    static int Memorization(int n) {
        int dp[] = new int[n + 1];
        for (int i = 0; i < n + 1; i++)
            dp[i] = -1;

        return stairsMemorization(n, dp);
    }

    static int stairsMemorization(int n, int[] dp) {

        if (n == 0)
            return 1;
        if (n == 1)
            return 1;
        if (dp[n] != -1)
            return dp[n];
        dp[n] = stairs(n - 1, dp) + stairs(n - 2, dp);
        return dp[n];
    }

    /*
     * Tabluation TC : O(N) SC O(N)
     */

    static int Tabluation(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++)
            dp[i] = dp[i - 1] + dp[i - 2];

        return dp[n];
    }

    public static void main(String[] args) {

        System.out.println(Tabluation(2));

    }
}
