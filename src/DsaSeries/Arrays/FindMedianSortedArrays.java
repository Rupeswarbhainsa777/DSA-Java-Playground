//package DsaSeries;
//
//
//// Hard
//public class FindMedianSortedArrays {
//    public static void main(String[] args) {
//        int arr1[] = {1, 2, 3};
//        int arr2[] = {1, 2, 3};
//        System.out.println(findMedianSortedArrays1(arr1, arr2));
//    }
//
//    public static double findMedianSortedArrays1(int[] nums1, int[] nums2) {
//
//        int mid = nums1.length + nums2.length / 2;
//        int left = 0;
//        int right = 0;
//        int counter = 0;
//        if (mid % 2 == 0) {
//            while (nums1[left]<) {
//                if (nums1[left] > nums2[right]) {
//                    left++;
//                    counter++;
//                } else if (nums1[left] < nums2[right]) {
//                    counter++;
//                    right++;
//                }
//            }
//        }
//
//
//        return 1;
//
//
//    }
//
//    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
//
//        int res[] = new int[nums1.length + nums2.length];
//        int idx = res.length - 1;
//
//        int fRight = nums1.length - 1;
//        int sRight = nums2.length - 1;
//
//        while (fRight >= 0 && sRight >= 0) {
//            if (nums1[fRight] >= nums2[sRight]) {
//                res[idx] = nums1[fRight];
//                fRight--;
//            } else {
//                res[idx] = nums2[sRight];
//                sRight--;
//            }
//            idx--;
//        }
//        while (fRight >= 0) {
//            res[idx] = nums1[fRight];
//            idx--;
//            fRight--;
//        }
//        while (sRight >= 0) {
//            res[idx] = nums2[sRight];
//            idx--;
//            sRight--;
//        }
//        double response = 0;
//        if (res.length % 2 == 0) {
//            response = (res[res.length / 2 - 1] + res[res.length / 2]) / 2.0;
//        } else {
//            response = res[res.length / 2];
//        }
//
//        return response;
//
//    }
//}
