package Coding;

import java.util.ArrayList;

/*
 * 
 * https://leetcode.com/problems/house-robber-ii/description/
 * 
 * 
 */

public class BankRobber2 {

    static int bank(int[] nums) {
        if (nums.length == 0)
            return 0;
        if (nums.length == 1)
            return nums[0];
        if (nums.length == 2)
            return Math.max(nums[0], nums[1]);

        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Integer> arr1 = new ArrayList<Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (i != 0)
                arr.add(nums[i]);
            if (i != nums.length - 1)
                arr1.add(nums[i]);
        }

        return Math.max(tabluation(arr1), tabluation(arr));
    }

    static int tabluation(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size() + 1];
        dp[0] = arr.get(0);
        dp[1] = Math.max(arr.get(0), arr.get(1));
        for (int i = 2; i < arr.size(); i++)
            dp[i] = Math.max(dp[i - 1], arr.get(i) + dp[i - 2]);
        return dp[arr.size() - 1];

    }

    public static void main(String[] args) {

        int[] arr = new int[] { 1, 2, 3, 1 };
        System.out.println(bank(arr));

    }
}
