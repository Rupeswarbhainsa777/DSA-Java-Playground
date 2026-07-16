package DsaSeries.Greedy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AssignCookies {
    public static void main(String[] args) {

        int arr1[] = {1, 2, 3};
        int arr2[] = {1, 1};

        System.out.println(findContentChildren(arr1, arr2));
    }

    public static int findContentChildren(int[] g, int[] s) {

        int count = 0;
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0;
        int j = 0;
        while (i < g.length && j < s.length) {
            if (g[i] <= s[j]) {
                count++;
                i++;
                j++;
            }else {
                j++;
            }
        }


        return count;


    }
}
