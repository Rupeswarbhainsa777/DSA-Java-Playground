package LeetCode_150.Arrays_String;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2};

    }

    public static int removeDuplicates(int[] nums) {

        int i = 0;
        int j = 1;
        while (j < nums.length) {
            if (nums[j] != nums[i]) {
                i++;
            }
            nums[i] = nums[j];
            j++;
        }
        return i + 1;

    }
}
