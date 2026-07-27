package LeetCodeDaily;


public class MaxProductOfTwoElement {
    public static void main(String[] args) {

        int arr[] = {3,4,5,2};
        System.out.println(maxProduct(arr));
    }

    public static int maxProduct(int[] nums) {


        int fMax = Integer.MIN_VALUE;
        int sMax = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > fMax) {
                sMax = fMax;
                fMax = nums[i];
            } else if (nums[i] > sMax ) {
                sMax = nums[i];
            }
        }
        fMax = fMax - 1;
        sMax = sMax - 1;

        return fMax * sMax;

    }


}
