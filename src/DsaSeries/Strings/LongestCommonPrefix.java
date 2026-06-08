package DsaSeries.Strings;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String st[] = {"flower", "flow", "flight"};

        System.out.println(longestCommonPrefix(st));

    }

    public static String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs);


        String st1 = strs[0];
        String st2 = strs[strs.length - 1];

        int i = 0;
        int j = 0;
        String res = "";
        while (i < st1.length() && j < st2.length()) {
            if (st1.charAt(i) == st2.charAt(j)) {
                res = res + st1.charAt(i);
                i++;
                j++;
            } else {
                return res;
            }
        }
        return res;

    }
}
