package Coding;

public class Pairs {
    


    public static void main(String[] args) {
        

        int [] arr = {2,4,3,5,1};
        System.out.println(reversePairs(arr));

    }


    static int reversePairs(int[] nums) {
        int Pairs = 0;
        for (int i = 0; i < nums.length; i++) {
          for (int j = i + 1; j < nums.length; j++) {
            if (nums[i] > 2 * nums[j]) Pairs++;
          }
        }
        return Pairs;
    }  
}
