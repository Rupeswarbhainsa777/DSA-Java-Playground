package DsaSeries;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {
        int arr[] = {2,2,2,2,2};
        List<List<Integer>> out = fourSum(arr, 8);
        System.out.println(out);

    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < nums.length; ) {

                long sum = 0;
                int left = j + 1;
                int right = nums.length - 1;
                while (left < right) {
                    sum = (long ) nums[i] + (long )nums[j] + (long )nums[left] + (long )nums[right];
                    if (sum < target) {
                        left++;
                    } else if (sum > target) {
                        right--;
                    } else {
                        System.out.println(nums[i]+" "+nums[j]+" "+nums[left]+" "+nums[right]);
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                        res.add(list);
                        left++;
                        right--;
                        while (left < right && nums[left] == nums[left - 1]) {
                            left++;
                        }
                        while (right > left && nums[right] == nums[right + 1]) {
                            right--;
                        }
                    }
                }
                j++;
               while (j<nums.length && nums[j]==nums[j-1] ){
                   j++;
               }

            }
        }


        return res;
    }
}
