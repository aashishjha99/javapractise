package Coding;

public class BestTimeToBuyStock {

    public static void main(String[] args) {

        int[] arr = { 7, 1, 5, 3, 6, 4 };
        System.out.println(maxProfit(arr));

    }

    static int maxProfit(int[] arr) {
        int maxPro = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int arrV : arr) {
            minPrice = Math.min(minPrice, arrV);
            maxPro = Math.max(maxPro, arrV - minPrice);
        }
        return maxPro;

    }
}
