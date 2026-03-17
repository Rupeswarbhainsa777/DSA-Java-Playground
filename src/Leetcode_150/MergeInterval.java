package Leetcode_150;

import java.util.*;

public class MergeInterval {
    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {4, 6}, {8, 10}, {15, 18}};

    }

    public static int[][] merge(int[][] intervals) {

        if(intervals.length<=1){
            return intervals;
        }

        Arrays.sort(intervals,Comparator.comparing(i->i[0]));

        List<int []> li = new ArrayList<>();

        int ar[] = intervals[0];
        li.add(ar);

        for(int[] intr : intervals ){
            if(intr[0] <= ar[1]){
                ar[1]=Math.max(ar[1],intr[1]);
            }
            else {
                ar=intr;
                li.add(intr);

            }
        }
        return li.toArray(new int[li.size()][]);



    }
}
