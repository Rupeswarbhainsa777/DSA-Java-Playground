package DsaSeries.Arrays;

import java.util.Arrays;

public class SortedSquares {
    public static void main(String[] args) {
        int arr[] = {-7, -3, 2, 3, 11};
        int res[] = sortedSquares2(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }

    }

    public static int[] sortedSquares2(int[] nums) {

        int length = nums.length - 1;
        int left = 0;
        int right = nums.length - 1;
        int ans[] = new int[nums.length];

        while (left <= right) {
            int leftSq = nums[left] * nums[left];
            int rightSq = nums[right] * nums[right];
            if (leftSq > rightSq) {
                ans[length] = leftSq;

                left++;
            } else {
                ans[length] = rightSq;
                right--;
            }
            length--;
        }
        return ans;

    }


    public static int[] sortedSquares(int[] nums) {

        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[idx] * nums[idx];
            idx++;
        }
        Arrays.sort(nums);
        return nums;

    }
}
