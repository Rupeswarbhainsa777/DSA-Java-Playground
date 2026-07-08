package DsaSeries.RecursionAndBacktracking;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

public class SubSet2 {
    public static void main(String[] args) {

    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();

        helper(0, nums, new ArrayList<>(), ans);
        return ans;
    }

    public void helper(int idx, int arr[], List<Integer> temp, List<List<Integer>> ans) {

        if (idx == arr.length) {

            ans.add(new ArrayList<>(temp));
            return;


        }


        temp.add(arr[idx]);
        helper(idx + 1, arr, temp, ans);
        temp.remove(temp.size() - 1);
        int index = idx + 1;
        while (index < arr.length && arr[index] == arr[index - 1]) {
            index++;
        }

        helper(index, arr, temp, ans);

    }
}
