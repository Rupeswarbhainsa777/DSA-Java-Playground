package Leetcode_150;

import java.util.ArrayList;
import java.util.Map;

public class MergeInterval {
    public static void main(String[] args) {

    }
    public static int[][] merge(int[][] intervals) {


        ArrayList<int []> li = new ArrayList<>();

        int idx =0;
        int n = intervals.length;

        if(intervals[0][0]<intervals[1][1]){
            li.add(intervals[0]);
            idx++;
        }
        n=n+1;


        while (idx<n &&  intervals[idx][0]>intervals[idx-1][1]){
            li.add(intervals[idx]);
            idx++;
        }
        while (idx < n && intervals[idx][0] <= intervals[idx - 1][1]) {

            intervals[idx - 1][0] = Math.min(intervals[idx][0], intervals[idx - 1][0]);
            intervals[idx - 1][1] = Math.max(intervals[idx][1], intervals[idx - 1][1]);

            idx++;
        }
        li.add(intervals[idx]);


        while (idx<n){
            li.add(intervals[idx]);
            idx++;
        }

        return li.toArray(new int[li.size()][]);

    }
}
