package Coding;

import java.util.Arrays;

public class SortZeroOneTwo {

    public static void main(String[] args) {

        int[] arr = { 2, 0, 2, 1, 1, 0 };

        print(arr);
        threePointerApproach(arr);
        print(arr);

    }

    private static void print(int[] arr) {
        for (int n : arr) {
            System.out.print(n);
        }

        System.out.println();
    }

    private static void threePointerApproach(int[] arr) {

        // dutch algorithm
        
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;

        int temp;

        while (mid <= high) {
            switch (arr[mid]) {

                case 0: {
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                }

                case 1:
                    mid++;
                    break;

                case 2: {
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
                }

            }

        }
    }
}
