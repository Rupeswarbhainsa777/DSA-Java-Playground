package DsaSeries.RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CombinationSum {
    public static void main(String[] args) {

    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();

        helper(candidates,0,new ArrayList<>(),res,target);

        return res;
    }
    public  void helper(int arr[], int idx, List<Integer> combination, List<List<Integer>> ans, int t) {


        if (idx == arr.length ||t<0 ) return;


        if (t == 0) {
            ans.add(new ArrayList<>(combination));
            return;
        }

        combination.add(arr[idx]);
        // helper(arr, idx + 1, combination, ans, t - arr[idx]);
        helper(arr, idx, combination, ans, t - arr[idx]);
        combination.remove(combination.size() - 1);
        helper(arr, idx + 1, combination, ans, t);


    }
}
