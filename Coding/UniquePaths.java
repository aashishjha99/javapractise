package Coding;

import java.util.Arrays;

public class UniquePaths {

    static int UniquePathsRecursion(int i, int j) {

        if (i == 0 || j == 0)
            return 1;
        if (i < 0 || j < 0)
            return 0;

        int up = UniquePathsRecursion(i - 1, j);
        int down = UniquePathsRecursion(i, j - 1);

        return up + down;
    }

    static int UniquePathsMemorization(int i, int j, int[][] dp) {

        if (i == 0 || j == 0)
            return 1;
        if (i < 0 || j < 0)
            return 0;

        if (dp[i][j] != -1)
            return dp[i][j];

        int up = UniquePathsMemorization(i - 1, j, dp);
        int down = UniquePathsMemorization(i, j - 1, dp);

        return dp[i][j] = up + down;
    }

    static int UniquePathsTabluation(int m, int n, int[][] dp) {

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                // base condition
                if (i == 0 && j == 0) {
                    dp[i][j] = 1;
                    continue;
                }

                int up = 0;
                int left = 0;

                if (i > 0)
                    up = dp[i - 1][j];
                if (j > 0)
                    left = dp[i][j - 1];

                dp[i][j] = up + left;
            }
        }

        return dp[m - 1][n - 1];

    }

    static int countWays(int m, int n) {
        int dp[][] = new int[m][n];
        for (int[] row : dp)
            Arrays.fill(row, -1);
        return UniquePathsTabluation(m, n, dp);

    }

    public static void main(String[] args) {

        System.out.println(countWays(3, 2));

    }

}
