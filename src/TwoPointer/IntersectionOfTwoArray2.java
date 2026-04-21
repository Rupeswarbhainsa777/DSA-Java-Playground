package TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArray2 {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 2, 1};
        int arr2[] = {2, 2};
        int ar[] = intersect(arr1, arr2);

        for (int i=0;i<ar.length;i++){
            System.out.println(ar[i]+" ");
        }

    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> li = new ArrayList<>();

        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                li.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        int arr[] = new int[li.size()];
        int idx = 0;
        for (int val : li) {
            arr[idx] = val;
            idx++;
        }
        return arr;

    }
}
