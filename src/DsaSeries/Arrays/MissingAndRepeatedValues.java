package DsaSeries.Arrays;

import java.util.*;

public class MissingAndRepeatedValues {
    public static void main(String[] args) {
        int arr[][] = {{1, 3}, {2, 2}};
        int arr1[] = findMissingAndRepeatedValues(arr);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i] + " ");
        }
    }

    public static int[] findMissingAndRepeatedValues(int[][] grid) {

        Set<Integer> set = new HashSet<>();
        int a = 0, b = 0;
        int expacted = 0, actual = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                actual += grid[i][j];

                if (set.contains(grid[i][j])) {
                    a = grid[i][j];

                }
                set.add(grid[i][j]);
            }
        }
        expacted = (grid.length * grid.length) * (grid.length * grid.length + 1) / 2;
        b = expacted + a - actual;

        return new int[]{
            a, b
        } ;

    }
}
