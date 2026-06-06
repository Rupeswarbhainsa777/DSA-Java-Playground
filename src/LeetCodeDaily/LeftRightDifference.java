package LeetCodeDaily;

import java.util.Map;

public class LeftRightDifference {
    public static void main(String[] args) {
        int arr[] = {10, 4, 8, 3};
        int res[] = leftRightDifference(arr);
        for (int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }

    public static int[] leftRightDifference(int[] nums) {

        int left[] = new int[nums.length];
        int right[] = new int[nums.length];


        int value = 0;
        for (int i = 0; i < nums.length; i++) {
            value += nums[i];
            left[i] = value - nums[i];
        }
        int val = 0;
        for (int i = nums.length - 1; i >= 0; i--) {

            val += nums[i];
            right[i] = val - nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i]= Math.abs(left[i]-right[i]);
        }
        return nums;
    }
}
