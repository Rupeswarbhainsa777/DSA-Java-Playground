package Leetcode_150;

import java.util.ArrayList;
import java.util.List;

public class SummeryRanges {
    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 4, 5, 7};

        System.out.println(summaryRanges(arr));


    }

    public static List<String> summaryRanges(int[] nums) {

        List<String> li = new ArrayList<>();


        for (int i = 0; i < nums.length; i++) {
            int st = nums[i];

            while (i + 1 < nums.length && nums[i + 1] - nums[i] == 1) {
                i++;
            }
            if (st != nums[i]) {
                li.add(st + "->" + nums[i]);
            } else {
                li.add(st + "");
            }


        }

        return li;
    }
}
