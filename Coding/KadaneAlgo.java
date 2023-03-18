package Coding;

public class KadaneAlgo {

    public static void main(String[] args) {

        int[] arr = { -1, -4, -2, -5, -1 };
        System.out.println(maxSubArray(arr));

    }

    static int maxSubArray(int[] arr) {

        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;

        for (int number : arr) {
            curSum += number;

            if (curSum > maxSum)
                maxSum = curSum;
            if (curSum < 0)
                curSum = 0;
        }

        return maxSum;

    }

}
