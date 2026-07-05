package DsaSeries.Arrays;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {


        int arr[] = {1,2,3};
        List<List<Integer>> li = permute(arr);

        System.out.println(li);


    }

    public static List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();

        helper(res,new ArrayList<>() ,nums);

        return res;

    }

    private static void helper(List<List<Integer>> resList, ArrayList<Integer> tempList, int[] arr) {


        if(tempList.size()==arr.length){
            resList.add(new ArrayList<>(tempList));
            return;
        }

        for (int number : arr) {
            if (tempList.contains(number)) continue;
            tempList.add(number);
            helper(resList, tempList, arr);

            tempList.remove(tempList.size() - 1);

        }
    }
}
