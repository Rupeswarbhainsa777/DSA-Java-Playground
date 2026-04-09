package GreedyAlgorithm;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class MinimumPlatforms {
    public static void main(String[] args) {


    }

    public static int minPlatform(int start[], int end[]) {

        Arrays.sort(start);
        Arrays.sort(end);
        int i = 0;
        int j = 0;
        int max = 0;
        int count = 0;
        while (i < start.length) {


            if (start[i] <= end[j]) {
                count++;
                i++;
            } else {
                count--;
                j++;
            }

            max = Math.max(max, count);
        }
        return max;


    }


}
