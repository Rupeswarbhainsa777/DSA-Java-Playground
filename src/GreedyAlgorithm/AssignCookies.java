package GreedyAlgorithm;

import java.util.Arrays;

public class AssignCookies {
    public static void main(String[] args) {
        int arr1[] = {1,2,3};
        int arr2[] = {1,1};

        System.out.println(findContentChildren(arr1,arr2));
    }
    public static  int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0; // cookies pointer
        int j = 0; // children pointer

        while (i < s.length && j < g.length) {
            if (s[i] >= g[j]) {
                j++; // child satisfied
            }
            i++; // move to next cookie
        }

        return j; // number of satisfied children
    }
}
