package DsaSeries.RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.List;

public class PalindromicPartition {
    public static void main(String[] args) {

        List<List<String>> li = partition("aab");
        System.out.println(li);
    }

    public static List<List<String>> partition(String s) {


        List<List<String>> ans = new ArrayList<>();

        helper(s, new ArrayList<>(), ans);

        return ans;
    }

    public static boolean isPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;


    }

    public static void helper(String str, List<String> temp, List<List<String>> ans) {


        if (str.isEmpty()) {
            ans.add(new ArrayList<>(temp));
            return;
        }


        for (int i = 0; i < str.length(); i++) {
            String st = str.substring(0, i + 1);
            if (isPalindrome(st)) {
                temp.add(st);
                helper(str.substring(i + 1), temp, ans);
                temp.remove(temp.size() - 1);
            }


        }


    }
}
