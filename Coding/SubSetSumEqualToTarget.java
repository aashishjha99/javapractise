import java.util.Arrays;

public class SubSetSumEqualToTarget {

    static Boolean recursion(int index, int target, int[] arr) {

        if (target == 0)
            return true;

        if (index == 0)
            return (arr[0] == target);

        boolean notTake = recursion(index - 1, target, arr);
        boolean take = false;

        if (arr[index] <= target)
            take = recursion(index - 1, target - arr[index], arr);

        return take | notTake;

    }

    static Boolean dpRecursion(int index, int target, int[] arr, int[][] dp) {

        if (target == 0)
            return true;

        if (index == 0)
            return arr[0] == target;

        if (dp[index][target] != -1)
            return dp[index][target] == 0 ? false : true;

        boolean notaken = dpRecursion(index - 1, target, arr, dp);

        boolean takenn = false;

        if (arr[index] <= target) {
            takenn = dpRecursion(index - 1, target - arr[index], arr, dp);

            dp[index][target] = notaken || takenn ? 1 : 0;
        }

        return takenn || notaken;

    }

    static Boolean tabluation(int index, int target, int[] arr) {

        boolean dp[][]= new boolean[index][target + 1];

        for (int i = 0; i < index; i++) {
            dp[i][0] = true;
        }

        if (arr[0] <= k)
            return dp[0][arr[0]] = true;

        for (int i = 1; i < index; i++) {

            for (int tgt = 1; tgt < target; tgt++) {

                boolean noTake = dp[i - 1][tgt];
                boolean take = false;
                if (arr[i] <= target)
                    take = dp[i - 1][target - arr[i]];

                dp[i][tgt] = noTake || take;

            }
        }
        return dp[n - 1][k];

    }

    static Boolean fillTheArray(int index, int target, int[] arr) {

        int[][] dp = new int[index][target + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);

        }
        return dpRecursion(index - 1, target, arr, dp);

    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4 };
        int k = 4;
        int n = arr.length;

        if (tabluation(n - 1, k, arr)) {
            System.out.println("found");
        } else {
            System.out.println("not found");
        }

    }
}
