package Coding;

import java.util.ArrayList;
import java.util.HashSet;

public class MajorityElementByN3times {

    public static void main(String[] args) {

        int arr[] = { 1, 2, 2, 3, 2 };
        ArrayList<Integer> majority = majorityList(arr);
        System.out.print("The majority element is: ");
        HashSet<Integer> s = new HashSet<>(majority);
        for (int it : s) {
            System.out.print(it + " ");
        }
        System.out.println();

    }

    static ArrayList<Integer> majorityList(int[] arr) {

        if (arr == null)
            return new ArrayList<Integer>();

        int number1 = -1, number2 = -1, count1 = 0, coun2 = 0, len = arr.length;

        for (int number : arr) {

            if (number1 == number) {
                count1++;
            } else if (number2 == number) {
                coun2++;
            } else if (count1 == 0) {
                number1 = number;
                ++count1;
            } else if (coun2 == 0) {
                number2 = number;
                ++coun2;
            } else {
                coun2--;
                count1--;
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        count1 = 0;
        coun2 = 0;

        for (int number : arr) {

            if (number == number1)
                ++count1;
            else if (number == number2)
                ++coun2;
        }

        if (coun2 > len / 3)
            ans.add(number2);
        if (count1 > len / 3)
            ans.add(number1);

        return ans;

    }
}
