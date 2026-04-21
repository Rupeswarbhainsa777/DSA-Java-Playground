package TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 1};
        int ar1[] = {2, 2};
        int ar[] = intersection1(arr, ar1);
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i] + " ");
        }


    }

    public static int[] intersection2(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> res = new HashSet<>();
        for (int val : nums2) {
            set1.add(val);
        }
        int i = 0;
        while (i < nums1.length) {
            if (set1.contains(nums1[i])) {
                res.add(nums1[i]);
            }
            i++;
        }
        int arr[] = new int[res.size()];

        int idx = 0;
        for (int val : res) {
            arr[idx] = val;
            idx++;
        }
        return arr;


    }

    public static int[] intersection1(int[] nums1, int[] nums2) {

        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> li = new ArrayList<>();

        for (int val : nums2) {
            set.add(val);
        }
        int i = 0;
        while (i < nums1.length) {
            if (set.contains(nums1[i])) {
                li.add(nums1[i]);
                set.remove(nums1[i]);
            }
            i++;
        }
        int arr[] = new int[li.size()];

        int idx = 0;
        for (int val : li) {
            arr[idx] = val;
            idx++;
        }
        return arr;

    }


    public static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Set<Integer> set = new HashSet<>();
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {

                set.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }

        }
        int arr[] = new int[set.size()];
        int idx = 0;
        for (int val : set) {

            arr[idx] = val;
            idx++;
        }
        return arr;


    }
}
