package TwoPointer;

import java.util.Arrays;

public class SortedSquaresArray {
    public static void main(String[] args) {
        int arr[] = {-4, -1, 0, 3, 10};
         int arr2[] =sortedSquares(arr);
        for (int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
    }

    public static int[] sortedSquares(int[] nums) {

        int k = 0;
        for (int i = 0; i < nums.length; i++) {

            nums[k] = Math.abs(nums[i]*nums[i]);
           k++;
        }
        Arrays.sort(nums);
        return nums;
    }
}
