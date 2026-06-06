package DsaSeries.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        int arr[][] = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int res[][] = merge(arr);
        for (int i=0;i<res.length;i++){
          for (int j=0;j<res[i].length;j++){
              System.out.print(res[i][j]+" ");
          }
            System.out.println();
        }
    }

    public static int[][] merge(int[][] intervals) {

        Comparator<int[]> com = new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[0], o2[0]);
            }
        };

        Arrays.sort(intervals, com);


        List<int[]> list = new ArrayList<>();
        int newInterval[] = intervals[0];
        list.add(newInterval);

        for (int[] inter : intervals) {
            if (inter[0] <= newInterval[1]) {
                newInterval[1] = Math.max(newInterval[1], inter[1]);
            }
            else {
                newInterval = inter;
                list.add(newInterval);
            }
        }
        return list.toArray(new int[list.size()][]);


    }
}
