package LeetCode_150.Arrays_String;

import java.util.Arrays;

public class HIndex {
    public static void main(String[] args) {

        int arr[] = {3,0,6,1,5};
        int ar = hIndex(arr);
        System.out.println(ar);

    }

    public static int hIndex(int[] citations) {

        Arrays.sort(citations);
        int j = 0;
        int count = 0;
        for (int i = 0; i < citations.length; i++) {

            for (int k = i; k < citations.length; k++) {
                j++;
            }
            if (citations[i] < j) {

                count++;
            }
            j = 0;

        }
        return count;
    }
}
