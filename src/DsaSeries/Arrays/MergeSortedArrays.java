package DsaSeries.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {


        int nums1[] = {4, 5, 6, 0, 0, 0};
        int m = 3;
        int nums2[] = {1, 2, 3};
        int n = 3;
        merge(nums1, m, nums2, n);
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + " ");
        }

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int first = m - 1;
        int second = n - 1;

        int idx = nums1.length - 1;


        while (second >= 0 && first >= 0) {
            if (nums1[first] >= nums2[second]) {
                nums1[idx] = nums1[first];
                first--;
                idx--;
            } else {
                nums1[idx] = nums2[second];
                second--;
                idx--;
            }
        }
        while (second >= 0) {
            nums1[idx--] = nums2[second--];
        }

    }
}
