package DsaSeries;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int arr[] = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> out = threeSum2(arr);
        System.out.println(out);

    }

    public static List<List<Integer>> threeSum2(int[] arr) {

        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<>();


        int length = arr.length;
        for (int i = 0; i < length; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = length - 1;
            int sum = 0;
            while (left < right) {
                sum = arr[i] + arr[left] + arr[right];
                if (sum > 0) {
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    List<Integer> list = new ArrayList<>();
                    list.add(arr[i]);
                    list.add(arr[left]);
                    list.add(arr[right]);
                    res.add(list);
                    left++;
                    right--;
                    while (left < right && arr[left] == arr[left - 1]) {
                        left++;
                    }
                    while (right > left && arr[right] == arr[right + 1]) {
                        right--;
                    }
                }

            }


        }
        return res;

    }


    public static List<List<Integer>> threeSum1(int[] arr) {

        List<List<Integer>> res = new ArrayList<>();

        int length = arr.length;


        int i = 3;
        for (int j = 0; j <= i; j++) {
            List<Integer> li = new ArrayList<>();

            int sum = 0;
            for (int k = j; k < j + i; k++) {
                System.out.print(arr[k] + " ");
                sum = sum + arr[k];
            }
            System.out.println();
            if (sum == 0) {
                for (int k = j; k < j + i; k++) {
                    li.add(arr[k]);
                }
                res.add(li);
            }
        }
        return res;


    }

    public static List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();


        int i = 0;
        int j = 2;
        while (j < arr.length) {
            List<Integer> li = new ArrayList<>();

            int sum = 0;
            for (int k = i; k <= j; k++) {

                sum = sum + arr[k];
            }
            if (sum == 0) {
                for (int k = i; k <= j; k++) {

                    li.add(arr[k]);
                }
                res.add(li);
            }

            i++;
            j++;


        }
        return res;

    }
}
