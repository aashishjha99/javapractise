package Coding;

import java.util.Arrays;

public class Traiangle {

    public static void main(String[] args) {

        int triangle[][] = { { 1 },
                { 2, 3 },
                { 3, 6, 7 },
                { 8, 9, 6, 10 } };

        int n = triangle.length;

        System.out.println(minimum(triangle, n));
        System.out.println(tab(triangle, n));
    }

    private static Integer minimum(int[][] triangle, int n) {

        int dp[][] = new int[n][n];
        for (int row[] : dp) {
            Arrays.fill(row, -1);

        }
        return min(0, 0, triangle, n, dp);

    }

    /*
     * Memorization
     */

    private static Integer min(int i, int j, int[][] triangle, int n, int[][] dp) {

        if (i == n - 1)
            return triangle[i][j];

        if (dp[i][j] != -1)
            return dp[i][j];

        int down = triangle[i][j] + min(i + 1, j, triangle, n, dp);
        int diagonal = triangle[i][j] + min(i + 1, j + 1, triangle, n, dp);
        return dp[i][j] = Math.min(down, diagonal);
    }

    /*
     * Tabluation
     */

    static Integer tab(int[][] triangle, int n) {
        int dp[][] = new int[n][n];

        for (int j = 0; j < n; j++) {
            dp[n - 1][j] = triangle[n - 1][j];
        }

        for (int i = n - 2; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {

                int down = triangle[i][j] + dp[i + 1][j];
                int diagonal = triangle[i][j] + dp[i + 1][j + 1];

                dp[i][j] = Math.min(down, diagonal);
            }
        }

        return dp[0][0];
    }
}
