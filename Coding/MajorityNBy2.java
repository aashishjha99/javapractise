package Coding;

public class MajorityNBy2 {

    public static void main(String[] args) {


        int [] arr = {2,2,1,1,1,2,2};

        System.out.println(majorityElement(arr));
    }


    // moore algorithm

    static int majorityElement(int[] arr) {

        int count = 0;
        int candidate = 0;

        for (int number : arr) {

            if (count == 0) {
                candidate = number;
            }

            if (number == candidate) {
                ++count;
            } else {
                --count;
            }

        }

        return candidate;


        
    }


    


    
}
