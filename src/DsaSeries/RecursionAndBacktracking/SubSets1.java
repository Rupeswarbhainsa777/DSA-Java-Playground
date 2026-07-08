package DsaSeries.RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.List;

public class SubSets1 {
    public static void main(String[] args) {

    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        helper(0, nums, new ArrayList<>(), ans);
        return ans;

    }

    public static void helper(int idx, int arr[], List<Integer> temp, List<List<Integer>> ans) {

        if (idx == arr.length) {
            ans.add(new ArrayList<>(temp));
            return;
        }


        temp.add(arr[idx]);
        helper(idx + 1, arr, temp, ans);
        temp.remove(temp.size() - 1);
        helper(idx + 1, arr, temp, ans);


    }
}
