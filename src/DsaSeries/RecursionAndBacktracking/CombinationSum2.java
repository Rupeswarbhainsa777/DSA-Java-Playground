package DsaSeries.RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {
    public static void main(String[] args) {

        int arr[] = {2,5,2,1,2};
        List<List<Integer>> list = combinationSum2(arr, 5);
        System.out.println(list);
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);

        List<List<Integer>> res = new ArrayList<>();
        helper(candidates,0,new ArrayList<>(),res,target);

        return res;
    }

    public static void helper(int arr[], int idx, List<Integer> combination, List<List<Integer>> ans, int t) {


        if (t == 0 ) {
            ans.add(new ArrayList<>(combination));
            return;
        }
        if (idx == arr.length || t < 0) return;



        combination.add(arr[idx]);

        helper(arr, idx+1, combination, ans, t - arr[idx]);
        combination.remove(combination.size() - 1);

        int index = idx + 1;
        while (index < arr.length && arr[index] == arr[index - 1]) {
            index++;
        }


        helper(arr, index, combination, ans, t);


    }
}
