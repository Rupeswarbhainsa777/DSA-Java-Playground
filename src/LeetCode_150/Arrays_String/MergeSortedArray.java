package LeetCode_150.Arrays_String;

public class MergeSortedArray {
    public static void main(String[] args) {


        int m = 3, n = 3;

        int nums1[] = {1, 2, 3, 0, 0, 0};
        int nums2[] = {2, 5, 6};
        merge(nums1, m, nums2, n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {


        int i = m - 1;
        int j = n - 1;

        int idx = m + n - 1;
        while (j >= 0) {

            if (i >= 0 && nums1[i] >= nums2[j]) {
                nums1[idx] = nums1[i];
                idx--;
                i--;
            } else {


                nums1[idx] = nums2[j];
                j--;


                idx--;
            }
        }


    }
}
